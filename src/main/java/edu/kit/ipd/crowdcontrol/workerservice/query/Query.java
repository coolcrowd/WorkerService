package edu.kit.ipd.crowdcontrol.workerservice.query;

import edu.kit.ipd.crowdcontrol.workerservice.BadRequestException;
import edu.kit.ipd.crowdcontrol.workerservice.InternalServerErrorException;
import edu.kit.ipd.crowdcontrol.workerservice.RequestHelper;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.enums.TaskStopgap;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.CalibrationAnswerOptionRecord;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.CalibrationRecord;
import edu.kit.ipd.crowdcontrol.workerservice.database.operations.ExperimentOperations;
import edu.kit.ipd.crowdcontrol.workerservice.database.operations.PlatformOperations;
import edu.kit.ipd.crowdcontrol.workerservice.database.operations.PopulationsOperations;
import edu.kit.ipd.crowdcontrol.workerservice.database.operations.TaskOperations;
import edu.kit.ipd.crowdcontrol.workerservice.objectservice.Communication;
import edu.kit.ipd.crowdcontrol.workerservice.proto.View;
import org.jooq.Result;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The class query is responsible for the query-part of the CQRS-pattern. Therefore it provides the getNext-method used
 * for the /next query.
 *
 * @author LeanderK
 * @version 1.0
 */
public class Query implements RequestHelper {
    private final HashMap<String, TaskChooserAlgorithm> strategies = new HashMap<>();
    private final PopulationsOperations populationsOperations;
    private final ExperimentOperations experimentOperations;
    private final PlatformOperations platformOperations;
    private final TaskOperations taskOperations;
    private final Communication communication;

    public Query(PopulationsOperations populationsOperations, ExperimentOperations experimentOperations,
                 PlatformOperations platformOperations, Communication communication, TaskOperations taskOperations) {
        this.populationsOperations = populationsOperations;
        this.experimentOperations = experimentOperations;
        this.platformOperations = platformOperations;
        this.communication = communication;
        this.taskOperations = taskOperations;
        registerTaskChooser(new AntiSpoof(experimentOperations, taskOperations));
    }

    Query(PopulationsOperations populationsOperations, ExperimentOperations experimentOperations,
          PlatformOperations platformOperations, Communication communication, TaskOperations taskOperations,
          TaskChooserAlgorithm mockUp) {
        this(populationsOperations, experimentOperations, platformOperations, communication, taskOperations);
        if (mockUp != null)
            registerTaskChooser(mockUp);
    }

    /**
     * used to register a new TaskStrategy.
     *
     * @param taskChooserAlgorithm the TaskChooserAlgorithm to register
     */
    private void registerTaskChooser(TaskChooserAlgorithm taskChooserAlgorithm) {
        strategies.put(taskChooserAlgorithm.getName(), taskChooserAlgorithm);
        experimentOperations.insertTaskChooserOrIgnore(taskChooserAlgorithm.getName(), taskChooserAlgorithm.getDescription());
        taskChooserAlgorithm.getParameters()
                .forEach(parameter -> experimentOperations.insertTaskChooserParamOrIgnore(
                        taskChooserAlgorithm.getDescription(),
                        parameter.getDescription(),
                        parameter.getRegex(),
                        parameter.getData())
                );
    }

    /**
     * this method returns an instance of View, determining what the worker should see next.
     * <p>
     * it is indented to be called when the Router gets an /next-Request.
     *
     * @param request  the SparkJava-Request
     * @param response the SparkJava-Response
     * @return the JSON-Representation of View
     */
    public String getNext(Request request, Response response) {
        boolean skipCreative = false;
        if ("skip".equals(request.queryParams("answer"))) {
            skipCreative = true;
        }
        boolean skipRating = false;
        if ("skip".equals(request.queryParams("rating"))) {
            skipRating = true;
        }
        View next = getNext(prepareView(request), request, skipCreative, skipRating);
        response.status(200);
        return transform(request, response, next);
    }

    /**
     * this method returns an instance of View, determining what the worker should see next.
     *
     * @param builder      the builder of the view containing a workerID or -1 if none provided
     * @param request      the request
     * @param skipCreative whether to skip the Creative-Task
     * @param skipRating   whether to skip the Rating-Task
     * @return an instance of View
     */
    private View getNext(View.Builder builder, Request request, boolean skipCreative, boolean skipRating) {
        if (builder.getWorkerId() == -1) {
            builder = handleNoWorkerID(builder, request);
        }
        Optional<View> email = getEmail(builder, request);
        if (email.isPresent()) {
            return email.get();
        }
        if (checkPopulation(builder, request)) {
            Optional<View> Calibration = getCalibration(builder, request);
            if (Calibration.isPresent()) {
                return Calibration.get();
            }
            Optional<View> strategyStep = getStrategyStep(builder, request, skipCreative, skipRating);
            if (strategyStep.isPresent()) {
                return strategyStep.get();
            }
        }
        return workerFinished(builder, request);
    }

    /**
     * initializes a new ViewBuilder
     *
     * @param request the Request
     * @return an instance of view with the workerID or -1 if none provided
     */
    private View.Builder prepareView(Request request) {
        View.Builder builder = View.newBuilder();
        String worker = request.queryParams("worker");
        if (worker != null) {
            try {
                builder.setWorkerId(Integer.parseInt(worker));
            } catch (NumberFormatException e) {
                throw new BadRequestException("workerID mus be an Integer");
            }
        } else {
            builder.setWorkerId(-1);
        }
        return builder;
    }

    /**
     * handles the case where no workerID was provided (workerID = -1).
     * This method just asks the Platform what to ID the worker should have and then calls getNext.
     *
     * @param builder the builder to use
     * @param request the request
     * @return an instance of View.
     */
    private View.Builder handleNoWorkerID(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        return communication.tryGetWorkerID(platformName, request.queryMap().toMap())
                .join()
                .map(builder::setWorkerId)
                .orElse(builder);
    }

    /**
     * checks if the worker does not belong to the wrong population
     *
     * @param builder the builder to use
     * @param request the request
     * @return true if the worker does not already belong got the wrong population
     */
    private boolean checkPopulation(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        int experiment = assertParameterInt(request, "experiment");
        return !populationsOperations.belongsToWrongPopulation(experiment, platformName, builder.getWorkerId());
    }

    /**
     * may returns the Calibration if there are needed Calibration left unanswered.
     *
     * @param builder the builder to use
     * @param request the request
     * @return an instance of view if the worker has to fill in some Calibration, or empty if not.
     */
    private Optional<View> getCalibration(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        int experiment = assertParameterInt(request, "experiment");
        if (platformOperations.getPlatform(platformName).getRenderCalibrations()) {
            Map<CalibrationRecord, Result<CalibrationAnswerOptionRecord>> calibrations =
                    populationsOperations.getCalibrations(experiment, platformName, builder.getWorkerId());
            if (calibrations.isEmpty()) {
                return Optional.empty();
            } else {
                return Optional.of(constructCalibrationView(calibrations, builder));
            }
        } else {
            return Optional.empty();
        }
    }

    /**
     * constructs the Calibration view from the qualifications-data.
     *
     * @param qualifications the qualifications
     * @param builder        the builder to use
     * @return an instance of View with the Type Calibration and the Calibration set.
     */
    private View constructCalibrationView(Map<CalibrationRecord, Result<CalibrationAnswerOptionRecord>> qualifications,
                                          View.Builder builder) {
        Function<CalibrationAnswerOptionRecord, View.CalibrationAnswerOption> constructAnswerOption = record ->
                View.CalibrationAnswerOption.newBuilder()
                        .setId(record.getIdCalibrationAnswerOption())
                        .setOption(record.getAnswer())
                        .build();

        List<View.Calibration> Calibration = qualifications.entrySet().stream()
                .map(entry -> View.Calibration.newBuilder()
                        .setQuestion(entry.getKey().getProperty())
                        .setId(entry.getKey().getIdCalibration())
                        .addAllAnswerOptions(entry.getValue().map(constructAnswerOption::apply))
                        .build()
                )
                .collect(Collectors.toList());

        return builder.addAllCalibrations(Calibration)
                .setType(View.Type.CALIBRATION)
                .build();
    }

    /**
     * may returns the next TaskView if the worker has not finished the assignment.
     *
     * @param builder      the builder to use
     * @param request      the request
     * @param skipCreative whether to skip the Creative-Task
     * @param skipRating   whether to skip the Rating-Task
     * @return a Task-View filled with the assignment, or empty if finished
     */
    private Optional<View> getStrategyStep(View.Builder builder, Request request, boolean skipCreative, boolean skipRating) {
        int experiment = assertParameterInt(request, "experiment");
        String platformName = assertParameter(request, "platform");
        if (skipCreative && skipRating)
            return Optional.empty();
        boolean skipCreativeTemp = skipCreative;
        boolean skipRatingTemp = skipRating;
        TaskStopgap stopgap = taskOperations.getTask(experiment, platformName).getStopgap();
        if (TaskStopgap.answer.equals(stopgap)) {
            skipRatingTemp = true;
        } else if (TaskStopgap.rating.equals(stopgap)) {
            skipCreativeTemp = true;
        }
        boolean resultingSkipCreative = skipCreativeTemp;
        boolean resultingSkipRating = skipRatingTemp;
        String algorithmTaskChooser = experimentOperations.getExperiment(experiment).getAlgorithmTaskChooser();
        return Optional.ofNullable(strategies.get(algorithmTaskChooser))
                .flatMap(strategy -> strategy.next(builder, request, experiment, platformName,
                        resultingSkipCreative, resultingSkipRating));
    }

    /**
     * may returns a View with the Type email if the platform needs an email and the user lacks one
     *
     * @param builder the builder to use
     * @param request the request
     * @return an instance of view with the type email or empty
     */
    private Optional<View> getEmail(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        if (platformOperations.getPlatform(platformName).getNeedsEmail() && builder.getWorkerId() == -1) {
            return Optional.of(builder.setType(View.Type.EMAIL).build());
        } else if (builder.getWorkerId() == -1) {
            throw new InternalServerErrorException("internal server error: did not get a workerID" +
                    "and the platform does not need an email");
        } else {
            return Optional.empty();
        }
    }

    /**
     * notifies the platform that the worker has finished the assignment and constructs the Finished View
     *
     * @param builder the builder to use
     * @param request the request
     * @return an View with the Type FINISHED
     */
    private View workerFinished(View.Builder builder, Request request) {
        //TODO notify??
        return builder.setType(View.Type.FINISHED)
                .build();
    }
}

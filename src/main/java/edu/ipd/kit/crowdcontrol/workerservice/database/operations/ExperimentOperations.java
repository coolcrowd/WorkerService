package edu.ipd.kit.crowdcontrol.workerservice.database.operations;

import edu.ipd.kit.crowdcontrol.workerservice.database.model.Tables;
import edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord;
import org.jooq.DSLContext;

/**
 * contains all the operations concerned with experiments.
 * @author LeanderK
 * @version 1.0
 */
public class ExperimentOperations extends AbstractOperation {
    public ExperimentOperations(DSLContext create) {
        super(create);
    }

    /**
     * returns an ExperimentRecord corresponding to the experimentID or throws an ExperimentNotFoundException.
     * @param experimentID the ID of the experiment
     * @return an instance of ExperimentRecord
     * @throws ExperimentNotFoundException if no matching experiment was found in the database
     */
    public ExperimentRecord getExperiment(int experimentID) throws ExperimentNotFoundException {
        return create.selectFrom(Tables.EXPERIMENT)
                .where(Tables.EXPERIMENT.IDEXPERIMENT.eq(experimentID))
                .fetchOptional()
                .orElseThrow(() -> new ExperimentNotFoundException(experimentID));
    }
}

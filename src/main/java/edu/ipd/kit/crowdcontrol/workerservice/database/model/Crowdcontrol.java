/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Crowdcontrol extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1280882920;

	/**
	 * The singleton instance of <code>crowdcontrol</code>
	 */
	public static final Crowdcontrol CROWDCONTROL = new Crowdcontrol();

	/**
	 * No further instances allowed
	 */
	private Crowdcontrol() {
		super("crowdcontrol");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answers.ANSWERS,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraints.CONSTRAINTS,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platforms.PLATFORMS,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationanswers.POPULATIONANSWERS,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Tags.TAGS,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK,
			edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER);
	}
}

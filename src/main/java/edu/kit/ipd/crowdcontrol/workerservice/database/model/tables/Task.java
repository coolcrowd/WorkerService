/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Task extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> {

	private static final long serialVersionUID = 904464123;

	/**
	 * The singleton instance of <code>crowdcontrol.Task</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task TASK = new edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Task.id_task</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.Integer> ID_TASK = createField("id_task", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Task.experiment</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Task.running</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.Boolean> RUNNING = createField("running", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Task.platform_data</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.String> PLATFORM_DATA = createField("platform_data", org.jooq.impl.SQLDataType.CLOB.length(16777215), this, "");

	/**
	 * The column <code>crowdcontrol.Task.crowd_platform</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.String> CROWD_PLATFORM = createField("crowd_platform", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Task.stopping</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.Boolean> STOPPING = createField("stopping", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Task</code> table reference
	 */
	public Task() {
		this("Task", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Task</code> table reference
	 */
	public Task(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task.TASK);
	}

	private Task(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> aliased) {
		this(alias, aliased, null);
	}

	private Task(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, java.lang.Integer> getIdentity() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys.IDENTITY_TASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys.KEY_TASK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord>>asList(edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys.KEY_TASK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, ?>>asList(edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys.IDEXPERIMENTHIT, edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys.RUNNINGONPLATTFORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Task(name, null);
	}
}

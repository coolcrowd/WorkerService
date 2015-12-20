/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkerRecord extends org.jooq.impl.UpdatableRecordImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -296729820;

	/**
	 * Setter for <code>crowdcontrol.Worker.idWorker</code>.
	 */
	public void setIdworker(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Worker.idWorker</code>.
	 */
	public java.lang.Integer getIdworker() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Worker.identification</code>.
	 */
	public void setIdentification(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Worker.identification</code>.
	 */
	public java.lang.String getIdentification() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Worker.platform</code>.
	 */
	public void setPlatform(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Worker.platform</code>.
	 */
	public java.lang.Integer getPlatform() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Worker.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Worker.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER.IDWORKER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER.IDENTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER.PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdworker();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getIdentification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkerRecord value1(java.lang.Integer value) {
		setIdworker(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkerRecord value2(java.lang.String value) {
		setIdentification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkerRecord value3(java.lang.Integer value) {
		setPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkerRecord value4(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkerRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WorkerRecord
	 */
	public WorkerRecord() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER);
	}

	/**
	 * Create a detached, initialised WorkerRecord
	 */
	public WorkerRecord(java.lang.Integer idworker, java.lang.String identification, java.lang.Integer platform, java.lang.String email) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER);

		setValue(0, idworker);
		setValue(1, identification);
		setValue(2, platform);
		setValue(3, email);
	}
}

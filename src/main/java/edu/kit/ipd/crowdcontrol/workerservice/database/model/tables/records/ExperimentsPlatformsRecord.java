/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentsPlatformsRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.ExperimentsPlatformsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1974897224;

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platforms.idExperiments_Platforms</code>.
	 */
	public void setIdexperimentsPlatforms(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platforms.idExperiments_Platforms</code>.
	 */
	public java.lang.Integer getIdexperimentsPlatforms() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platforms.experiment</code>.
	 */
	public void setExperiment(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platforms.experiment</code>.
	 */
	public java.lang.Integer getExperiment() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platforms.platform</code>.
	 */
	public void setPlatform(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platforms.platform</code>.
	 */
	public java.lang.String getPlatform() {
		return (java.lang.String) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatforms.EXPERIMENTS_PLATFORMS.IDEXPERIMENTS_PLATFORMS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatforms.EXPERIMENTS_PLATFORMS.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatforms.EXPERIMENTS_PLATFORMS.PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdexperimentsPlatforms();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformsRecord value1(java.lang.Integer value) {
		setIdexperimentsPlatforms(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformsRecord value2(java.lang.Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformsRecord value3(java.lang.String value) {
		setPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentsPlatformsRecord
	 */
	public ExperimentsPlatformsRecord() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatforms.EXPERIMENTS_PLATFORMS);
	}

	/**
	 * Create a detached, initialised ExperimentsPlatformsRecord
	 */
	public ExperimentsPlatformsRecord(java.lang.Integer idexperimentsPlatforms, java.lang.Integer experiment, java.lang.String platform) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatforms.EXPERIMENTS_PLATFORMS);

		setValue(0, idexperimentsPlatforms);
		setValue(1, experiment);
		setValue(2, platform);
	}
}

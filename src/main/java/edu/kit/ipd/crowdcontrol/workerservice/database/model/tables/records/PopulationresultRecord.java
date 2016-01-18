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
public class PopulationResultRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationResultRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 218862574;

	/**
	 * Setter for <code>crowdcontrol.Population_Result.id_population_result</code>.
	 */
	public void setIdPopulationResult(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population_Result.id_population_result</code>.
	 */
	public java.lang.Integer getIdPopulationResult() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Population_Result.worker</code>.
	 */
	public void setWorker(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population_Result.worker</code>.
	 */
	public java.lang.Integer getWorker() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Population_Result.answer</code>.
	 */
	public void setAnswer(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population_Result.answer</code>.
	 */
	public java.lang.Integer getAnswer() {
		return (java.lang.Integer) getValue(2);
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
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationResult.POPULATION_RESULT.ID_POPULATION_RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationResult.POPULATION_RESULT.WORKER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationResult.POPULATION_RESULT.ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdPopulationResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getWorker();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationResultRecord value1(java.lang.Integer value) {
		setIdPopulationResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationResultRecord value2(java.lang.Integer value) {
		setWorker(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationResultRecord value3(java.lang.Integer value) {
		setAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationResultRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PopulationResultRecord
	 */
	public PopulationResultRecord() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationResult.POPULATION_RESULT);
	}

	/**
	 * Create a detached, initialised PopulationResultRecord
	 */
	public PopulationResultRecord(java.lang.Integer idPopulationResult, java.lang.Integer worker, java.lang.Integer answer) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationResult.POPULATION_RESULT);

		setValue(0, idPopulationResult);
		setValue(1, worker);
		setValue(2, answer);
	}
}

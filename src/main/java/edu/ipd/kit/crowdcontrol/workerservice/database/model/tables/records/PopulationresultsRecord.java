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
public class PopulationresultsRecord extends org.jooq.impl.UpdatableRecordImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1704901908;

	/**
	 * Setter for <code>crowdcontrol.PopulationResults.idPopulationResults</code>.
	 */
	public void setIdpopulationresults(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.PopulationResults.idPopulationResults</code>.
	 */
	public java.lang.Integer getIdpopulationresults() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.PopulationResults.worker</code>.
	 */
	public void setWorker(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.PopulationResults.worker</code>.
	 */
	public java.lang.Integer getWorker() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.PopulationResults.answer</code>.
	 */
	public void setAnswer(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.PopulationResults.answer</code>.
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
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresults.POPULATIONRESULTS.IDPOPULATIONRESULTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresults.POPULATIONRESULTS.WORKER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresults.POPULATIONRESULTS.ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdpopulationresults();
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
	public PopulationresultsRecord value1(java.lang.Integer value) {
		setIdpopulationresults(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationresultsRecord value2(java.lang.Integer value) {
		setWorker(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationresultsRecord value3(java.lang.Integer value) {
		setAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationresultsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PopulationresultsRecord
	 */
	public PopulationresultsRecord() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresults.POPULATIONRESULTS);
	}

	/**
	 * Create a detached, initialised PopulationresultsRecord
	 */
	public PopulationresultsRecord(java.lang.Integer idpopulationresults, java.lang.Integer worker, java.lang.Integer answer) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresults.POPULATIONRESULTS);

		setValue(0, idpopulationresults);
		setValue(1, worker);
		setValue(2, answer);
	}
}

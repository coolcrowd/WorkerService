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
public class PopulationansweroptionRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 727092465;

	/**
	 * Setter for <code>crowdcontrol.PopulationAnswerOption.idPopulationAnswerOption</code>.
	 */
	public void setIdpopulationansweroption(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.PopulationAnswerOption.idPopulationAnswerOption</code>.
	 */
	public java.lang.Integer getIdpopulationansweroption() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.PopulationAnswerOption.population</code>.
	 */
	public void setPopulation(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.PopulationAnswerOption.population</code>.
	 */
	public java.lang.Integer getPopulation() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.PopulationAnswerOption.answer</code>.
	 */
	public void setAnswer(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.PopulationAnswerOption.answer</code>.
	 */
	public java.lang.String getAnswer() {
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
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.IDPOPULATIONANSWEROPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.POPULATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdpopulationansweroption();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPopulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationansweroptionRecord value1(java.lang.Integer value) {
		setIdpopulationansweroption(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationansweroptionRecord value2(java.lang.Integer value) {
		setPopulation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationansweroptionRecord value3(java.lang.String value) {
		setAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationansweroptionRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PopulationansweroptionRecord
	 */
	public PopulationansweroptionRecord() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION);
	}

	/**
	 * Create a detached, initialised PopulationansweroptionRecord
	 */
	public PopulationansweroptionRecord(java.lang.Integer idpopulationansweroption, java.lang.Integer population, java.lang.String answer) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION);

		setValue(0, idpopulationansweroption);
		setValue(1, population);
		setValue(2, answer);
	}
}

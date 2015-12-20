/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population, java.lang.Integer> {

	/**
	 * Create a new PopulationDao without any configuration
	 */
	public PopulationDao() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population.class);
	}

	/**
	 * Create a new PopulationDao with an attached configuration
	 */
	public PopulationDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population object) {
		return object.getIdpopulation();
	}

	/**
	 * Fetch records that have <code>idPopulation IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population> fetchByIdpopulation(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.IDPOPULATION, values);
	}

	/**
	 * Fetch a unique record that has <code>idPopulation = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population fetchOneByIdpopulation(java.lang.Integer value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.IDPOPULATION, value);
	}

	/**
	 * Fetch records that have <code>property IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population> fetchByProperty(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.PROPERTY, values);
	}

	/**
	 * Fetch records that have <code>answers IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population> fetchByAnswers(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.ANSWERS, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Population> fetchByDescription(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.DESCRIPTION, values);
	}
}

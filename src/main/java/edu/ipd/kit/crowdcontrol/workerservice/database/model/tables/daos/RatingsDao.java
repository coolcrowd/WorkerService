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
public class RatingsDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings, java.lang.Integer> {

	/**
	 * Create a new RatingsDao without any configuration
	 */
	public RatingsDao() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings.class);
	}

	/**
	 * Create a new RatingsDao with an attached configuration
	 */
	public RatingsDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings object) {
		return object.getIdratings();
	}

	/**
	 * Fetch records that have <code>idRatings IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings> fetchByIdratings(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.IDRATINGS, values);
	}

	/**
	 * Fetch a unique record that has <code>idRatings = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings fetchOneByIdratings(java.lang.Integer value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.IDRATINGS, value);
	}

	/**
	 * Fetch records that have <code>task IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings> fetchByTask(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.TASK, values);
	}

	/**
	 * Fetch records that have <code>answer_r IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings> fetchByAnswerR(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.ANSWER_R, values);
	}

	/**
	 * Fetch records that have <code>timestamp IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings> fetchByTimestamp(java.sql.Timestamp... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.TIMESTAMP, values);
	}

	/**
	 * Fetch records that have <code>rating IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings> fetchByRating(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.RATING, values);
	}

	/**
	 * Fetch records that have <code>worker_id IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Ratings> fetchByWorkerId(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS.WORKER_ID, values);
	}
}

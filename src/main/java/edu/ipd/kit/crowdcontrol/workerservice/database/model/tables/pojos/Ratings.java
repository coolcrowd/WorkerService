/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ratings implements java.io.Serializable {

	private static final long serialVersionUID = 1518313789;

	private java.lang.Integer  idratings;
	private java.lang.Integer  hitR;
	private java.lang.Integer  answerR;
	private java.sql.Timestamp timestamp;
	private java.lang.Integer  rating;
	private java.lang.Integer  workerId;

	public Ratings() {}

	public Ratings(
		java.lang.Integer  idratings,
		java.lang.Integer  hitR,
		java.lang.Integer  answerR,
		java.sql.Timestamp timestamp,
		java.lang.Integer  rating,
		java.lang.Integer  workerId
	) {
		this.idratings = idratings;
		this.hitR = hitR;
		this.answerR = answerR;
		this.timestamp = timestamp;
		this.rating = rating;
		this.workerId = workerId;
	}

	public java.lang.Integer getIdratings() {
		return this.idratings;
	}

	public void setIdratings(java.lang.Integer idratings) {
		this.idratings = idratings;
	}

	public java.lang.Integer getHitR() {
		return this.hitR;
	}

	public void setHitR(java.lang.Integer hitR) {
		this.hitR = hitR;
	}

	public java.lang.Integer getAnswerR() {
		return this.answerR;
	}

	public void setAnswerR(java.lang.Integer answerR) {
		this.answerR = answerR;
	}

	public java.sql.Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(java.sql.Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public java.lang.Integer getRating() {
		return this.rating;
	}

	public void setRating(java.lang.Integer rating) {
		this.rating = rating;
	}

	public java.lang.Integer getWorkerId() {
		return this.workerId;
	}

	public void setWorkerId(java.lang.Integer workerId) {
		this.workerId = workerId;
	}
}

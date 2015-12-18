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
public class Payment implements java.io.Serializable {

	private static final long serialVersionUID = 333634671;

	private java.lang.Integer  idpayment;
	private java.lang.Integer  workerId;
	private java.lang.Integer  experimentId;
	private java.sql.Timestamp timestamp;

	public Payment() {}

	public Payment(
		java.lang.Integer  idpayment,
		java.lang.Integer  workerId,
		java.lang.Integer  experimentId,
		java.sql.Timestamp timestamp
	) {
		this.idpayment = idpayment;
		this.workerId = workerId;
		this.experimentId = experimentId;
		this.timestamp = timestamp;
	}

	public java.lang.Integer getIdpayment() {
		return this.idpayment;
	}

	public void setIdpayment(java.lang.Integer idpayment) {
		this.idpayment = idpayment;
	}

	public java.lang.Integer getWorkerId() {
		return this.workerId;
	}

	public void setWorkerId(java.lang.Integer workerId) {
		this.workerId = workerId;
	}

	public java.lang.Integer getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(java.lang.Integer experimentId) {
		this.experimentId = experimentId;
	}

	public java.sql.Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(java.sql.Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}

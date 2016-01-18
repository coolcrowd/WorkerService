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
public class PaymentRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 23576229;

	/**
	 * Setter for <code>crowdcontrol.Payment.id_payment</code>.
	 */
	public void setIdPayment(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Payment.id_payment</code>.
	 */
	public java.lang.Integer getIdPayment() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Payment.worker_id</code>.
	 */
	public void setWorkerId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Payment.worker_id</code>.
	 */
	public java.lang.Integer getWorkerId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Payment.experiment_id</code>.
	 */
	public void setExperimentId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Payment.experiment_id</code>.
	 */
	public java.lang.Integer getExperimentId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Payment.timestamp</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Payment.timestamp</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Payment.amount</code>.
	 */
	public void setAmount(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Payment.amount</code>.
	 */
	public java.lang.Integer getAmount() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>crowdcontrol.Payment.giftcode</code>.
	 */
	public void setGiftcode(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Payment.giftcode</code>.
	 */
	public java.lang.Integer getGiftcode() {
		return (java.lang.Integer) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.ID_PAYMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.WORKER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.EXPERIMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.GIFTCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdPayment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getWorkerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getExperimentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getGiftcode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord value1(java.lang.Integer value) {
		setIdPayment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord value2(java.lang.Integer value) {
		setWorkerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord value3(java.lang.Integer value) {
		setExperimentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord value4(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord value5(java.lang.Integer value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord value6(java.lang.Integer value) {
		setGiftcode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.sql.Timestamp value4, java.lang.Integer value5, java.lang.Integer value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PaymentRecord
	 */
	public PaymentRecord() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT);
	}

	/**
	 * Create a detached, initialised PaymentRecord
	 */
	public PaymentRecord(java.lang.Integer idPayment, java.lang.Integer workerId, java.lang.Integer experimentId, java.sql.Timestamp timestamp, java.lang.Integer amount, java.lang.Integer giftcode) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT);

		setValue(0, idPayment);
		setValue(1, workerId);
		setValue(2, experimentId);
		setValue(3, timestamp);
		setValue(4, amount);
		setValue(5, giftcode);
	}
}

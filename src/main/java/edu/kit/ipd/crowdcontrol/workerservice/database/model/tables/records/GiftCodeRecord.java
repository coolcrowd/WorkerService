/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.GiftCode;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GiftCodeRecord extends UpdatableRecordImpl<GiftCodeRecord> implements Record3<Integer, String, Integer> {

	private static final long serialVersionUID = -867983611;

	/**
	 * Setter for <code>crowdcontrol.Gift_Code.id_gift_code</code>.
	 */
	public void setIdGiftCode(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Gift_Code.id_gift_code</code>.
	 */
	public Integer getIdGiftCode() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Gift_Code.code</code>.
	 */
	public void setCode(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Gift_Code.code</code>.
	 */
	public String getCode() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Gift_Code.amount</code>.
	 */
	public void setAmount(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Gift_Code.amount</code>.
	 */
	public Integer getAmount() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return GiftCode.GIFT_CODE.ID_GIFT_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return GiftCode.GIFT_CODE.CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return GiftCode.GIFT_CODE.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdGiftCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GiftCodeRecord value1(Integer value) {
		setIdGiftCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GiftCodeRecord value2(String value) {
		setCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GiftCodeRecord value3(Integer value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GiftCodeRecord values(Integer value1, String value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GiftCodeRecord
	 */
	public GiftCodeRecord() {
		super(GiftCode.GIFT_CODE);
	}

	/**
	 * Create a detached, initialised GiftCodeRecord
	 */
	public GiftCodeRecord(Integer idGiftCode, String code, Integer amount) {
		super(GiftCode.GIFT_CODE);

		setValue(0, idGiftCode);
		setValue(1, code);
		setValue(2, amount);
	}
}

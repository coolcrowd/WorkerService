/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.GiftCodeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class GiftCode extends TableImpl<GiftCodeRecord> {

	private static final long serialVersionUID = -1563880648;

	/**
	 * The reference instance of <code>crowdcontrol.Gift_Code</code>
	 */
	public static final GiftCode GIFT_CODE = new GiftCode();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<GiftCodeRecord> getRecordType() {
		return GiftCodeRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Gift_Code.id_gift_code</code>.
	 */
	public final TableField<GiftCodeRecord, Integer> ID_GIFT_CODE = createField("id_gift_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Gift_Code.code</code>.
	 */
	public final TableField<GiftCodeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Gift_Code.amount</code>.
	 */
	public final TableField<GiftCodeRecord, Integer> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Gift_Code</code> table reference
	 */
	public GiftCode() {
		this("Gift_Code", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Gift_Code</code> table reference
	 */
	public GiftCode(String alias) {
		this(alias, GIFT_CODE);
	}

	private GiftCode(String alias, Table<GiftCodeRecord> aliased) {
		this(alias, aliased, null);
	}

	private GiftCode(String alias, Table<GiftCodeRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<GiftCodeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_GIFT_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<GiftCodeRecord> getPrimaryKey() {
		return Keys.KEY_GIFT_CODE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<GiftCodeRecord>> getKeys() {
		return Arrays.<UniqueKey<GiftCodeRecord>>asList(Keys.KEY_GIFT_CODE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GiftCode as(String alias) {
		return new GiftCode(alias, this);
	}

	/**
	 * Rename this table
	 */
	public GiftCode rename(String name) {
		return new GiftCode(name, null);
	}
}

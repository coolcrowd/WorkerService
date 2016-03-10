/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Platform extends TableImpl<PlatformRecord> {

	private static final long serialVersionUID = -1900267631;

	/**
	 * The reference instance of <code>crowdcontrol.Platform</code>
	 */
	public static final Platform PLATFORM = new Platform();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PlatformRecord> getRecordType() {
		return PlatformRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Platform.id_platform</code>.
	 */
	public final TableField<PlatformRecord, String> ID_PLATFORM = createField("id_platform", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Platform.name</code>.
	 */
	public final TableField<PlatformRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Platform.render_calibrations</code>.
	 */
	public final TableField<PlatformRecord, Boolean> RENDER_CALIBRATIONS = createField("render_calibrations", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Platform.needs_email</code>.
	 */
	public final TableField<PlatformRecord, Boolean> NEEDS_EMAIL = createField("needs_email", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Platform.inactive</code>.
	 */
	public final TableField<PlatformRecord, Boolean> INACTIVE = createField("inactive", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Platform</code> table reference
	 */
	public Platform() {
		this("Platform", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Platform</code> table reference
	 */
	public Platform(String alias) {
		this(alias, PLATFORM);
	}

	private Platform(String alias, Table<PlatformRecord> aliased) {
		this(alias, aliased, null);
	}

	private Platform(String alias, Table<PlatformRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PlatformRecord> getPrimaryKey() {
		return Keys.KEY_PLATFORM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PlatformRecord>> getKeys() {
		return Arrays.<UniqueKey<PlatformRecord>>asList(Keys.KEY_PLATFORM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Platform as(String alias) {
		return new Platform(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Platform rename(String name) {
		return new Platform(name, null);
	}
}

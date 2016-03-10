/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import com.google.gson.JsonElement;

import edu.kit.ipd.crowdcontrol.workerservice.database.bindings.JSONGsonBinding;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.ExperimentsPlatformRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ExperimentsPlatform extends TableImpl<ExperimentsPlatformRecord> {

	private static final long serialVersionUID = -1154788725;

	/**
	 * The reference instance of <code>crowdcontrol.Experiments_Platform</code>
	 */
	public static final ExperimentsPlatform EXPERIMENTS_PLATFORM = new ExperimentsPlatform();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ExperimentsPlatformRecord> getRecordType() {
		return ExperimentsPlatformRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Experiments_Platform.idExperiments_Platforms</code>.
	 */
	public final TableField<ExperimentsPlatformRecord, Integer> IDEXPERIMENTS_PLATFORMS = createField("idExperiments_Platforms", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Experiments_Platform.experiment</code>.
	 */
	public final TableField<ExperimentsPlatformRecord, Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Experiments_Platform.platform</code>.
	 */
	public final TableField<ExperimentsPlatformRecord, String> PLATFORM = createField("platform", org.jooq.impl.SQLDataType.VARCHAR.length(191), this, "");

	/**
	 * The column <code>crowdcontrol.Experiments_Platform.platform_data</code>.
	 */
	public final TableField<ExperimentsPlatformRecord, JsonElement> PLATFORM_DATA = createField("platform_data", org.jooq.impl.DefaultDataType.getDefaultDataType("json"), this, "", new JSONGsonBinding());

	/**
	 * The column <code>crowdcontrol.Experiments_Platform.identification</code>.
	 */
	public final TableField<ExperimentsPlatformRecord, String> IDENTIFICATION = createField("identification", org.jooq.impl.SQLDataType.VARCHAR.length(191), this, "");

	/**
	 * Create a <code>crowdcontrol.Experiments_Platform</code> table reference
	 */
	public ExperimentsPlatform() {
		this("Experiments_Platform", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Experiments_Platform</code> table reference
	 */
	public ExperimentsPlatform(String alias) {
		this(alias, EXPERIMENTS_PLATFORM);
	}

	private ExperimentsPlatform(String alias, Table<ExperimentsPlatformRecord> aliased) {
		this(alias, aliased, null);
	}

	private ExperimentsPlatform(String alias, Table<ExperimentsPlatformRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ExperimentsPlatformRecord, Integer> getIdentity() {
		return Keys.IDENTITY_EXPERIMENTS_PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ExperimentsPlatformRecord> getPrimaryKey() {
		return Keys.KEY_EXPERIMENTS_PLATFORM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ExperimentsPlatformRecord>> getKeys() {
		return Arrays.<UniqueKey<ExperimentsPlatformRecord>>asList(Keys.KEY_EXPERIMENTS_PLATFORM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ExperimentsPlatformRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ExperimentsPlatformRecord, ?>>asList(Keys.PLATFORM_USER, Keys.ACTIVE_PLATFORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatform as(String alias) {
		return new ExperimentsPlatform(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ExperimentsPlatform rename(String name) {
		return new ExperimentsPlatform(name, null);
	}
}

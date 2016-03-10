/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TemplateConstraintRecord;

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
public class TemplateConstraint extends TableImpl<TemplateConstraintRecord> {

	private static final long serialVersionUID = 644294166;

	/**
	 * The reference instance of <code>crowdcontrol.Template_Constraint</code>
	 */
	public static final TemplateConstraint TEMPLATE_CONSTRAINT = new TemplateConstraint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TemplateConstraintRecord> getRecordType() {
		return TemplateConstraintRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Template_Constraint.id_teamplate_Constraint</code>.
	 */
	public final TableField<TemplateConstraintRecord, Integer> ID_TEAMPLATE_CONSTRAINT = createField("id_teamplate_Constraint", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Template_Constraint.template</code>.
	 */
	public final TableField<TemplateConstraintRecord, Integer> TEMPLATE = createField("template", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Template_Constraint.constraint</code>.
	 */
	public final TableField<TemplateConstraintRecord, String> CONSTRAINT = createField("constraint", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Template_Constraint</code> table reference
	 */
	public TemplateConstraint() {
		this("Template_Constraint", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Template_Constraint</code> table reference
	 */
	public TemplateConstraint(String alias) {
		this(alias, TEMPLATE_CONSTRAINT);
	}

	private TemplateConstraint(String alias, Table<TemplateConstraintRecord> aliased) {
		this(alias, aliased, null);
	}

	private TemplateConstraint(String alias, Table<TemplateConstraintRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TemplateConstraintRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TEMPLATE_CONSTRAINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TemplateConstraintRecord> getPrimaryKey() {
		return Keys.KEY_TEMPLATE_CONSTRAINT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TemplateConstraintRecord>> getKeys() {
		return Arrays.<UniqueKey<TemplateConstraintRecord>>asList(Keys.KEY_TEMPLATE_CONSTRAINT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<TemplateConstraintRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TemplateConstraintRecord, ?>>asList(Keys.CONSTRAINED_TEMPLATE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TemplateConstraint as(String alias) {
		return new TemplateConstraint(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TemplateConstraint rename(String name) {
		return new TemplateConstraint(name, null);
	}
}

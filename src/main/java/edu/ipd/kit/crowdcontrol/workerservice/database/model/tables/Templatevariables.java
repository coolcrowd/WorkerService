/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Templatevariables extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord> {

	private static final long serialVersionUID = 64212228;

	/**
	 * The singleton instance of <code>crowdcontrol.TemplateVariables</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables TEMPLATEVARIABLES = new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.TemplateVariables.idTemplateVariables</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, java.lang.Integer> IDTEMPLATEVARIABLES = createField("idTemplateVariables", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.TemplateVariables.template</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, java.lang.Integer> TEMPLATE = createField("template", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.TemplateVariables.name</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.TemplateVariables.description</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.TemplateVariables.type</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>crowdcontrol.TemplateVariables</code> table reference
	 */
	public Templatevariables() {
		this("TemplateVariables", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.TemplateVariables</code> table reference
	 */
	public Templatevariables(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables.TEMPLATEVARIABLES);
	}

	private Templatevariables(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Templatevariables(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_TEMPLATEVARIABLES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_TEMPLATEVARIABLES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplatevariablesRecord, ?>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.REFERENCEDTEMPLATE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Templatevariables(name, null);
	}
}

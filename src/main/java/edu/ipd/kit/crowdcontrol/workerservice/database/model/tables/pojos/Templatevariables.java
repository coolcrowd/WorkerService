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
public class Templatevariables implements java.io.Serializable {

	private static final long serialVersionUID = 77675784;

	private java.lang.Integer idtemplatevariables;
	private java.lang.Integer template;
	private java.lang.String  name;
	private java.lang.String  description;
	private java.lang.String  type;

	public Templatevariables() {}

	public Templatevariables(
		java.lang.Integer idtemplatevariables,
		java.lang.Integer template,
		java.lang.String  name,
		java.lang.String  description,
		java.lang.String  type
	) {
		this.idtemplatevariables = idtemplatevariables;
		this.template = template;
		this.name = name;
		this.description = description;
		this.type = type;
	}

	public java.lang.Integer getIdtemplatevariables() {
		return this.idtemplatevariables;
	}

	public void setIdtemplatevariables(java.lang.Integer idtemplatevariables) {
		this.idtemplatevariables = idtemplatevariables;
	}

	public java.lang.Integer getTemplate() {
		return this.template;
	}

	public void setTemplate(java.lang.Integer template) {
		this.template = template;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}
}

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
public class Population implements java.io.Serializable {

	private static final long serialVersionUID = -1681593234;

	private java.lang.Integer idpopulation;
	private java.lang.String  property;
	private java.lang.String  answers;
	private java.lang.String  description;

	public Population() {}

	public Population(
		java.lang.Integer idpopulation,
		java.lang.String  property,
		java.lang.String  answers,
		java.lang.String  description
	) {
		this.idpopulation = idpopulation;
		this.property = property;
		this.answers = answers;
		this.description = description;
	}

	public java.lang.Integer getIdpopulation() {
		return this.idpopulation;
	}

	public void setIdpopulation(java.lang.Integer idpopulation) {
		this.idpopulation = idpopulation;
	}

	public java.lang.String getProperty() {
		return this.property;
	}

	public void setProperty(java.lang.String property) {
		this.property = property;
	}

	public java.lang.String getAnswers() {
		return this.answers;
	}

	public void setAnswers(java.lang.String answers) {
		this.answers = answers;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}
}

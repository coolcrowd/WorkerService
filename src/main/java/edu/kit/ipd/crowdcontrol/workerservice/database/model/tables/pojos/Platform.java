/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Platform implements java.io.Serializable {

	private static final long serialVersionUID = -1164566916;

	private java.lang.String  idPlatform;
	private java.lang.String  name;
	private java.lang.Boolean renderCalibrations;
	private java.lang.Boolean needsEmail;

	public Platform() {}

	public Platform(
		java.lang.String  idPlatform,
		java.lang.String  name,
		java.lang.Boolean renderCalibrations,
		java.lang.Boolean needsEmail
	) {
		this.idPlatform = idPlatform;
		this.name = name;
		this.renderCalibrations = renderCalibrations;
		this.needsEmail = needsEmail;
	}

	public java.lang.String getIdPlatform() {
		return this.idPlatform;
	}

	public void setIdPlatform(java.lang.String idPlatform) {
		this.idPlatform = idPlatform;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Boolean getRenderCalibrations() {
		return this.renderCalibrations;
	}

	public void setRenderCalibrations(java.lang.Boolean renderCalibrations) {
		this.renderCalibrations = renderCalibrations;
	}

	public java.lang.Boolean getNeedsEmail() {
		return this.needsEmail;
	}

	public void setNeedsEmail(java.lang.Boolean needsEmail) {
		this.needsEmail = needsEmail;
	}
}

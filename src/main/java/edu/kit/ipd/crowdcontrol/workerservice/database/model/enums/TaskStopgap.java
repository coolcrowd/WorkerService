/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TaskStopgap implements org.jooq.EnumType {

	answer("answer"),

	rating("rating"),

	disabled("disabled");

	private final java.lang.String literal;

	private TaskStopgap(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "Task_stopgap";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}

/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.RatingReservationRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class RatingReservation extends TableImpl<RatingReservationRecord> {

	private static final long serialVersionUID = 629118062;

	/**
	 * The reference instance of <code>crowdcontrol.Rating_Reservation</code>
	 */
	public static final RatingReservation RATING_RESERVATION = new RatingReservation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RatingReservationRecord> getRecordType() {
		return RatingReservationRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Rating_Reservation.idReserverd_Rating</code>.
	 */
	public final TableField<RatingReservationRecord, Integer> IDRESERVERD_RATING = createField("idReserverd_Rating", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Reservation.worker</code>.
	 */
	public final TableField<RatingReservationRecord, Integer> WORKER = createField("worker", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Reservation.experiment</code>.
	 */
	public final TableField<RatingReservationRecord, Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Reservation.answer</code>.
	 */
	public final TableField<RatingReservationRecord, Integer> ANSWER = createField("answer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Reservation.timestamp</code>.
	 */
	public final TableField<RatingReservationRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Reservation.used</code>.
	 */
	public final TableField<RatingReservationRecord, Boolean> USED = createField("used", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Rating_Reservation</code> table reference
	 */
	public RatingReservation() {
		this("Rating_Reservation", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Rating_Reservation</code> table reference
	 */
	public RatingReservation(String alias) {
		this(alias, RATING_RESERVATION);
	}

	private RatingReservation(String alias, Table<RatingReservationRecord> aliased) {
		this(alias, aliased, null);
	}

	private RatingReservation(String alias, Table<RatingReservationRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RatingReservationRecord> getPrimaryKey() {
		return Keys.KEY_RATING_RESERVATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RatingReservationRecord>> getKeys() {
		return Arrays.<UniqueKey<RatingReservationRecord>>asList(Keys.KEY_RATING_RESERVATION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RatingReservationRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RatingReservationRecord, ?>>asList(Keys.WORKER_WILL_RATE, Keys.EXPERIMENT_WILL_RATED_ON, Keys.RESERVED_ANSWER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingReservation as(String alias) {
		return new RatingReservation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RatingReservation rename(String name) {
		return new RatingReservation(name, null);
	}
}

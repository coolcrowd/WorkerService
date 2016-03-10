/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.AlgorithmAnswerQualityParam;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AlgorithmAnswerQualityParamRecord extends UpdatableRecordImpl<AlgorithmAnswerQualityParamRecord> implements Record5<Integer, String, String, String, String> {

	private static final long serialVersionUID = 110612186;

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.id_Algorithm_Answer_Quality_Param</code>.
	 */
	public void setIdAlgorithmAnswerQualityParam(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.id_Algorithm_Answer_Quality_Param</code>.
	 */
	public Integer getIdAlgorithmAnswerQualityParam() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.description</code>.
	 */
	public void setDescription(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.regex</code>.
	 */
	public void setRegex(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.regex</code>.
	 */
	public String getRegex() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.algorithm</code>.
	 */
	public void setAlgorithm(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.algorithm</code>.
	 */
	public String getAlgorithm() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.data</code>.
	 */
	public void setData(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Answer_Quality_Param.data</code>.
	 */
	public String getData() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM.ID_ALGORITHM_ANSWER_QUALITY_PARAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM.REGEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM.ALGORITHM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdAlgorithmAnswerQualityParam();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getRegex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getAlgorithm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmAnswerQualityParamRecord value1(Integer value) {
		setIdAlgorithmAnswerQualityParam(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmAnswerQualityParamRecord value2(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmAnswerQualityParamRecord value3(String value) {
		setRegex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmAnswerQualityParamRecord value4(String value) {
		setAlgorithm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmAnswerQualityParamRecord value5(String value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmAnswerQualityParamRecord values(Integer value1, String value2, String value3, String value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlgorithmAnswerQualityParamRecord
	 */
	public AlgorithmAnswerQualityParamRecord() {
		super(AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM);
	}

	/**
	 * Create a detached, initialised AlgorithmAnswerQualityParamRecord
	 */
	public AlgorithmAnswerQualityParamRecord(Integer idAlgorithmAnswerQualityParam, String description, String regex, String algorithm, String data) {
		super(AlgorithmAnswerQualityParam.ALGORITHM_ANSWER_QUALITY_PARAM);

		setValue(0, idAlgorithmAnswerQualityParam);
		setValue(1, description);
		setValue(2, regex);
		setValue(3, algorithm);
		setValue(4, data);
	}
}

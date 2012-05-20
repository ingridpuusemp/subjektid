package backend.model;

// Generated May 11, 2012 8:57:46 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * SubjectAttribute generated by hbm2java
 */
public class SubjectAttribute implements java.io.Serializable {

	private long subjectAttribute;
	private Long subjectFk;
	private Long subjectAttributeTypeFk;
	private Long subjectTypeFk;
	private Long orderby;
	private String valueText;
	private long valueNumber;
	private Date valueDate;
	private int dataType;

	public SubjectAttribute() {
	}

	public SubjectAttribute(long subjectAttribute) {
		this.subjectAttribute = subjectAttribute;
	}

	public SubjectAttribute(long subjectAttribute, Long subjectFk,
			Long subjectAttributeTypeFk, Long subjectTypeFk, Long orderby,
			String valueText, long valueNumber, Date valueDate,
			int dataType) {
		this.subjectAttribute = subjectAttribute;
		this.subjectFk = subjectFk;
		this.subjectAttributeTypeFk = subjectAttributeTypeFk;
		this.subjectTypeFk = subjectTypeFk;
		this.orderby = orderby;
		this.valueText = valueText;
		this.valueNumber = valueNumber;
		this.valueDate = valueDate;
		this.dataType = dataType;
	}

	public long getSubjectAttribute() {
		return this.subjectAttribute;
	}

	public void setSubjectAttribute(long subjectAttribute) {
		this.subjectAttribute = subjectAttribute;
	}

	public Long getSubjectFk() {
		return this.subjectFk;
	}

	public void setSubjectFk(Long subjectFk) {
		this.subjectFk = subjectFk;
	}

	public Long getSubjectAttributeTypeFk() {
		return this.subjectAttributeTypeFk;
	}

	public void setSubjectAttributeTypeFk(Long subjectAttributeTypeFk) {
		this.subjectAttributeTypeFk = subjectAttributeTypeFk;
	}

	public Long getSubjectTypeFk() {
		return this.subjectTypeFk;
	}

	public void setSubjectTypeFk(Long subjectTypeFk) {
		this.subjectTypeFk = subjectTypeFk;
	}

	public Long getOrderby() {
		return this.orderby;
	}

	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}

	public String getValueText() {
		return this.valueText;
	}

	public void setValueText(String valueText) {
		this.valueText = valueText;
	}

	public long getValueNumber() {
		return this.valueNumber;
	}

	public void setValueNumber(long valueNumber) {
		this.valueNumber = valueNumber;
	}

	public Date getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public int getDataType() {
		return this.dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

}
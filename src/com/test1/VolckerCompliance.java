package com.test1;

public class VolckerCompliance {
	private Integer volkerComplianceCode;
	private Integer linkedGroupEffective;
	private String linkedGroupEffectiveDate;
	private String linkedGroupVolkerComplianceDesc;
	private String linkedGroupVolkerComplianceShortDesc;
	private Integer linkedGroupDecimalPositions;
	private String linkedGroupVolckerComplianceSymbol;
	private String linkedGroupVolckerComplianceScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public VolckerCompliance() {

	}

	public VolckerCompliance(Integer volkerComplianceCode, Integer linkedGroupEffective,
			String linkedGroupEffectiveDate, String linkedGroupVolkerComplianceDesc,
			String linkedGroupVolkerComplianceShortDesc, Integer linkedGroupDecimalPositions,
			String linkedGroupVolckerComplianceSymbol, String linkedGroupVolckerComplianceScale, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.volkerComplianceCode = volkerComplianceCode;
		this.linkedGroupEffective = linkedGroupEffective;
		this.linkedGroupEffectiveDate = linkedGroupEffectiveDate;
		this.linkedGroupVolkerComplianceDesc = linkedGroupVolkerComplianceDesc;
		this.linkedGroupVolkerComplianceShortDesc = linkedGroupVolkerComplianceShortDesc;
		this.linkedGroupDecimalPositions = linkedGroupDecimalPositions;
		this.linkedGroupVolckerComplianceSymbol = linkedGroupVolckerComplianceSymbol;
		this.linkedGroupVolckerComplianceScale = linkedGroupVolckerComplianceScale;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getVolkerComplianceCode() {
		return volkerComplianceCode;
	}

	public void setVolkerComplianceCode(Integer volkerComplianceCode) {
		this.volkerComplianceCode = volkerComplianceCode;
	}

	public Integer getLinkedGroupEffective() {
		return linkedGroupEffective;
	}

	public void setLinkedGroupEffective(Integer linkedGroupEffective) {
		this.linkedGroupEffective = linkedGroupEffective;
	}

	public String getLinkedGroupEffectiveDate() {
		return linkedGroupEffectiveDate;
	}

	public void setLinkedGroupEffectiveDate(String linkedGroupEffectiveDate) {
		this.linkedGroupEffectiveDate = linkedGroupEffectiveDate;
	}

	public String getLinkedGroupVolkerComplianceDesc() {
		return linkedGroupVolkerComplianceDesc;
	}

	public void setLinkedGroupVolkerComplianceDesc(String linkedGroupVolkerComplianceDesc) {
		this.linkedGroupVolkerComplianceDesc = linkedGroupVolkerComplianceDesc;
	}

	public String getLinkedGroupVolkerComplianceShortDesc() {
		return linkedGroupVolkerComplianceShortDesc;
	}

	public void setLinkedGroupVolkerComplianceShortDesc(String linkedGroupVolkerComplianceShortDesc) {
		this.linkedGroupVolkerComplianceShortDesc = linkedGroupVolkerComplianceShortDesc;
	}

	public Integer getLinkedGroupDecimalPositions() {
		return linkedGroupDecimalPositions;
	}

	public void setLinkedGroupDecimalPositions(Integer linkedGroupDecimalPositions) {
		this.linkedGroupDecimalPositions = linkedGroupDecimalPositions;
	}

	public String getLinkedGroupVolckerComplianceSymbol() {
		return linkedGroupVolckerComplianceSymbol;
	}

	public void setLinkedGroupVolckerComplianceSymbol(String linkedGroupVolckerComplianceSymbol) {
		this.linkedGroupVolckerComplianceSymbol = linkedGroupVolckerComplianceSymbol;
	}

	public String getLinkedGroupVolckerComplianceScale() {
		return linkedGroupVolckerComplianceScale;
	}

	public void setLinkedGroupVolckerComplianceScale(String linkedGroupVolckerComplianceScale) {
		this.linkedGroupVolckerComplianceScale = linkedGroupVolckerComplianceScale;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

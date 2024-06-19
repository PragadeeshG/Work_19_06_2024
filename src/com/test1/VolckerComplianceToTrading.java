package com.test1;

public class VolckerComplianceToTrading {
	private Integer volckerComplianceCode;
	private Integer dataCustodianId;
	private Integer tradeId;
	private String preTradeApplicable;
	private Integer businessIndicator;
	private boolean userCode;
	private boolean countryCode;
	private String unitName;
	private String linkedGroupMappingId;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public VolckerComplianceToTrading() {

	}

	public VolckerComplianceToTrading(Integer volckerComplianceCode, Integer dataCustodianId, Integer tradeId,
			String preTradeApplicable, Integer businessIndicator, boolean userCode, boolean countryCode,
			String unitName, String linkedGroupMappingId, String creationCr, String modifiedCr, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.volckerComplianceCode = volckerComplianceCode;
		this.dataCustodianId = dataCustodianId;
		this.tradeId = tradeId;
		this.preTradeApplicable = preTradeApplicable;
		this.businessIndicator = businessIndicator;
		this.userCode = userCode;
		this.countryCode = countryCode;
		this.unitName = unitName;
		this.linkedGroupMappingId = linkedGroupMappingId;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getVolckerComplianceCode() {
		return volckerComplianceCode;
	}

	public void setVolckerComplianceCode(Integer volckerComplianceCode) {
		this.volckerComplianceCode = volckerComplianceCode;
	}

	public Integer getDataCustodianId() {
		return dataCustodianId;
	}

	public void setDataCustodianId(Integer dataCustodianId) {
		this.dataCustodianId = dataCustodianId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public String getPreTradeApplicable() {
		return preTradeApplicable;
	}

	public void setPreTradeApplicable(String preTradeApplicable) {
		this.preTradeApplicable = preTradeApplicable;
	}

	public Integer getBusinessIndicator() {
		return businessIndicator;
	}

	public void setBusinessIndicator(Integer businessIndicator) {
		this.businessIndicator = businessIndicator;
	}

	public boolean isUserCode() {
		return userCode;
	}

	public void setUserCode(boolean userCode) {
		this.userCode = userCode;
	}

	public boolean isCountryCode() {
		return countryCode;
	}

	public void setCountryCode(boolean countryCode) {
		this.countryCode = countryCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getLinkedGroupMappingId() {
		return linkedGroupMappingId;
	}

	public void setLinkedGroupMappingId(String linkedGroupMappingId) {
		this.linkedGroupMappingId = linkedGroupMappingId;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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

package ca.bc.gov.mal.cirras.underwriting.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//
// This is not going to be a resource.
//
public class DopYieldFieldForage implements Serializable {
	private static final long serialVersionUID = 1L;

	// INVENTORY_FIELD
	private String inventoryFieldGuid;

	// INVENTORY_SEEDED_FORAGE
	private String commodityTypeCode;
	private String commodityTypeDescription;
	private Boolean isQuantityInsurableInd;
	private Double fieldAcres;
	private String cropVarietyName;

	// INVENTORY_FIELD
	private Integer insurancePlanId;
	private Integer fieldId;
	private Integer cropYear;
	
	// DECLARED_YIELD_FIELD_FORAGE
	private List<DopYieldFieldForageCut> dopYieldFieldForageCuts = new ArrayList<DopYieldFieldForageCut>(); 
	
	public String getInventoryFieldGuid() {
		return inventoryFieldGuid;
	}

	public void setInventoryFieldGuid(String inventoryFieldGuid) {
		this.inventoryFieldGuid = inventoryFieldGuid;
	}

	public String getCommodityTypeCode() {
		return commodityTypeCode;
	}

	public void setCommodityTypeCode(String commodityTypeCode) {
		this.commodityTypeCode = commodityTypeCode;
	}

	public String getCommodityTypeDescription() {
		return commodityTypeDescription;
	}

	public void setCommodityTypeDescription(String commodityTypeDescription) {
		this.commodityTypeDescription = commodityTypeDescription;
	}

	public Boolean getIsQuantityInsurableInd() {
		return isQuantityInsurableInd;
	}

	public void setIsQuantityInsurableInd(Boolean isQuantityInsurableInd) {
		this.isQuantityInsurableInd = isQuantityInsurableInd;
	}

	public Double getFieldAcres() {
		return fieldAcres;
	}

	public void setFieldAcres(Double fieldAcres) {
		this.fieldAcres = fieldAcres;
	}
	
	public String getCropVarietyName() {
		return cropVarietyName;
	}

	public void setCropVarietyName(String cropVarietyName) {
		this.cropVarietyName = cropVarietyName;
	}

	public Integer getInsurancePlanId() {
		return insurancePlanId;
	}
	public void setInsurancePlanId(Integer insurancePlanId) {
		this.insurancePlanId = insurancePlanId;
	}

	public Integer getFieldId() {
		return fieldId;
	}
	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}

	public Integer getCropYear() {
		return cropYear;
	}
	public void setCropYear(Integer cropYear) {
		this.cropYear = cropYear;
	}
	
	public List<DopYieldFieldForageCut> getDopYieldFieldForageCuts() {
		return dopYieldFieldForageCuts;
	}

	public void setDopYieldFieldForageCuts(List<DopYieldFieldForageCut> dopYieldFieldForageCuts) {
		this.dopYieldFieldForageCuts = dopYieldFieldForageCuts;
	}		
}

package com.maverick.besttea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetRawMateialDetailsWithUnit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="raw_material_id", length=11)
	private int rawMaterialId;
	
	@Column(name="unit_id", length=11)
	private int unitId;
	
	@Column(name="material_name", length=11)
	private String materialName;
	
	@Column(name="material_desc", length=11)
	private String materialDesc;
	
	@Column(name="unit_name", length=11)
	private String unitName;

	public int getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(int rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialDesc() {
		return materialDesc;
	}

	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return "getRawMateialDetailsWithUnit [rawMaterialId=" + rawMaterialId + ", unitId=" + unitId + ", materialName="
				+ materialName + ", materialDesc=" + materialDesc + ", unitName=" + unitName + "]";
	}
	
	
}

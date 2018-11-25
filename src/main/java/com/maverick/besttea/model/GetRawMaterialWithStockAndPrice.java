package com.maverick.besttea.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetRawMaterialWithStockAndPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="raw_material_id")
	private int rawMaterialId;
	
	@Column(name="material_name")
	private String materialName;
	
	@Column(name="supplier_id")
	private int supplierId;
	
	@Column(name="total_qty")
	private int totalQty;
	
	@Column(name="new_price")
	private int newPrice;

	 

	public int getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(int rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(int newPrice) {
		this.newPrice = newPrice;
	}

	@Override
	public String toString() {
		return "GetRawMaterialWithStockAndPrice [rawMaterialId=" + rawMaterialId + ", materialName=" + materialName
				+ ", supplierId=" + supplierId + ", totalQty=" + totalQty + ", newPrice=" + newPrice + "]";
	}
 
	
	
	
}

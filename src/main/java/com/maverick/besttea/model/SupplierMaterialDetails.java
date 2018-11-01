package com.maverick.besttea.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="supplier_material_details")
@EntityListeners(AuditingEntityListener.class)
public class SupplierMaterialDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="supplier_material_id", length=11)
	private int supplierMaterialId;
	
	@Column(name="raw_material_id", length=11)
	private int rawMaterialId;
	
	@Column(name="supplier_id", length=11)
	private int supplierId;
	
	@Column(name="del_status", length=11)
	private int delStatus;
	
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	@Column(name="modified_date")
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	public int getSupplierMaterialId() {
		return supplierMaterialId;
	}

	public void setSupplierMaterialId(int supplierMaterialId) {
		this.supplierMaterialId = supplierMaterialId;
	}

	public int getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(int rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "SupplierMaterialDetails [supplierMaterialId=" + supplierMaterialId + ", rawMaterialId=" + rawMaterialId
				+ ", supplierId=" + supplierId + ", delStatus=" + delStatus + ", createDate=" + createDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}
	
	
}

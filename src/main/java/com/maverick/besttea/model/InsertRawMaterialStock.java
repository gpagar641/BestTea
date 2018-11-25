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
@Table(name="raw_material_stock")
@EntityListeners(AuditingEntityListener.class)
public class InsertRawMaterialStock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", length=11)
	private int id;
	
	@Column(name="raw_material_id", length=11)
	private int rawMaterialId;
	
	@Column(name="supplier_id", length=11)
	private int supplierId;
	
	
	@Column(name="exist_qty", length=11)
	private int existQty;
	
	@Column(name="total_qty", length=11)
	private int totalQty;
	
	@Column(name="new_price", length=11)
	private int newPrice;
	
	@Column(name="new_qty", length=11)
	private int newQty;
	
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	@Column(name="modified_date")
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	
	@Column(name="del_status",length=11)
	private int delStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getExistQty() {
		return existQty;
	}

	public void setExistQty(int existQty) {
		this.existQty = existQty;
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

	public int getNewQty() {
		return newQty;
	}

	public void setNewQty(int newQty) {
		this.newQty = newQty;
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

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	@Override
	public String toString() {
		return "InsertRawMaterialStock [id=" + id + ", rawMaterialId=" + rawMaterialId + ", supplierId=" + supplierId
				+ ", existQty=" + existQty + ", totalQty=" + totalQty + ", newPrice=" + newPrice + ", newQty=" + newQty
				+ ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + ", delStatus=" + delStatus + "]";
	}
	
	
}

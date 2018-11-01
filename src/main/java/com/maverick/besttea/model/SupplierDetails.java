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
@Table(name="supplier_details")
@EntityListeners(AuditingEntityListener.class)
public class SupplierDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="supplier_id", length=11)
	private int supplierId;
	
	@Column(name="supplier_name", length=200)
	private String supplierName;
	
	@Column(name="email", length=200)
	private String email;
	
	@Column(name="contact_no", length=13)
	private String contactNo;
	
	@Column(name="address", length=200)
	private String address;
	
	@Column(name="gst_number", length=11)
	private String gstNumber;
	
	@Column(name="company_name", length=200)
	private String companyName;

	@Column(name="del_status",length=11)
	private int delStatus;
	
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	@Column(name="modified_date")
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	
	
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

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "SupplierDetails [supplierId=" + supplierId + ", supplierName=" + supplierName + ", email=" + email
				+ ", contactNo=" + contactNo + ", address=" + address + ", gstNumber=" + gstNumber + ", companyName="
				+ companyName + ", delStatus=" + delStatus + ", createDate=" + createDate + ", modifiedDate="
				+ modifiedDate + "]";
	}

	
	
	
	
}

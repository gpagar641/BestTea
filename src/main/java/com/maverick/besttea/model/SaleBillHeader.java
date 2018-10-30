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
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="sale_bill_header")
@EntityListeners(AuditingEntityListener.class)
public class SaleBillHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sale_bill_id", length=11)
	private int saleBillId;
	
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	@Column(name="total_amount")
	private float totalAmount;
	
	@Column(name="customer_name", nullable=true)
	private String customerName;
	
	@Column(name="cust_mob_number", nullable=true)
	private String custMobileNo;
	
	@Column(name="discount", nullable=true)
	private int discount;
	
	@Column(name="payable_amount")
	private float payableAmount;

	public int getSaleBillId() {
		return saleBillId;
	}

	public void setSaleBillId(int saleBillId) {
		this.saleBillId = saleBillId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustMobileNo() {
		return custMobileNo;
	}

	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public float getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(float payableAmount) {
		this.payableAmount = payableAmount;
	}

	@Override
	public String toString() {
		return "SaleBillHeader [saleBillId=" + saleBillId + ", createDate=" + createDate + ", totalAmount="
				+ totalAmount + ", customerName=" + customerName + ", custMobileNo=" + custMobileNo + ", discount="
				+ discount + ", payableAmount=" + payableAmount + "]";
	}
	
	
	
}

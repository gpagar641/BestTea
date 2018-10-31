package com.maverick.besttea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="sale_bill_details")
@EntityListeners(AuditingEntityListener.class)
public class SaleBillDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sale_bill_details_id", length=11)
	private int saleBillDetailsId;
	
	@Column(name="sale_bill_number", length=11)
	private int saleBillNumber;
	
	@Column(name="item_id", length=11)
	private int itemId;
	
	@Column(name="item_price", length=11)
	private float itemPrice;
	
	@Column(name="quantity", length=11)
	private int quantity;
	
	@Column(name="type", length=11)
	private int type;
	
	@Column(name="total_amount", length=11)
	private float totalAmount;
	
	@Transient
	private String itemName;

	public int getSaleBillDetailsId() {
		return saleBillDetailsId;
	}

	public void setSaleBillDetailsId(int saleBillDetailsId) {
		this.saleBillDetailsId = saleBillDetailsId;
	}

	public int getSaleBillNumber() {
		return saleBillNumber;
	}

	public void setSaleBillNumber(int saleBillNumber) {
		this.saleBillNumber = saleBillNumber;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "SaleBillDetails [saleBillDetailsId=" + saleBillDetailsId + ", saleBillNumber=" + saleBillNumber
				+ ", itemId=" + itemId + ", itemPrice=" + itemPrice + ", quantity=" + quantity + ", type=" + type
				+ ", totalAmount=" + totalAmount + ", itemName=" + itemName + "]";
	}

	 
	
}

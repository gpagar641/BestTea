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
@Table(name="item_price")
@EntityListeners(AuditingEntityListener.class)
public class ItemPriceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_price_id", length=11)
	private int itemPriceId;
	
	@Column(name="item_id", length=11)
	private int itemId;
	
	@Column(name="item_price", length=11)
	private float itemPrice;
	
	@Column(name="del_status",length=11)
	private int delStatus;
	
	@Column(name="item_desc",length=255)
	private String item_desc;
	
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	@Column(name="modified_date")
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	
	
	
	public String getItem_desc() {
		return item_desc;
	}

	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}

	public int getItemPriceId() {
		return itemPriceId;
	}

	public void setItemPriceId(int itemPriceId) {
		this.itemPriceId = itemPriceId;
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
		return "ItemPriceDetails [itemPriceId=" + itemPriceId + ", itemId=" + itemId + ", itemPrice=" + itemPrice
				+ ", delStatus=" + delStatus + ", item_desc=" + item_desc + ", createDate=" + createDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}

	
	
	
	
}

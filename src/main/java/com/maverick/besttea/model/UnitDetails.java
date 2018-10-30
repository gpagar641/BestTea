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
@Table(name="unit_details")
@EntityListeners(AuditingEntityListener.class)
public class UnitDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="unit_id", length=11)
	private int unitId;
	
	@Column(name="unit_name", length=200)
	private String unitName;
	
	@Column(name="unit_description", length=200)
	private int unitDescription;
	
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

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public int getUnitDescription() {
		return unitDescription;
	}

	public void setUnitDescription(int unitDescription) {
		this.unitDescription = unitDescription;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	@Override
	public String toString() {
		return "UnitDetails [unitId=" + unitId + ", unitName=" + unitName + ", unitDescription=" + unitDescription
				+ ", delStatus=" + delStatus + ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + "]";
	}

	

	
	
	
	
}

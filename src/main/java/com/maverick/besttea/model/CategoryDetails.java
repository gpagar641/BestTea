package com.maverick.besttea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="category_details")
@EntityListeners(AuditingEntityListener.class)
public class CategoryDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id", length=11)
	private int categoryId;
	
	@Column(name="category_name",length=200)
	private String categoryName;
	
	@Column(name="del_status",length=11)
	private int delStaus;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getDelStaus() {
		return delStaus;
	}

	public void setDelStaus(int delStaus) {
		this.delStaus = delStaus;
	}

	@Override
	public String toString() {
		return "CategoryDetails [categoryId=" + categoryId + ", categoryName=" + categoryName + ", delStaus=" + delStaus
				+ "]";
	}
	
	

}

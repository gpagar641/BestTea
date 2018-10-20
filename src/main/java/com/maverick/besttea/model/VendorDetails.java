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
@Table(name="vendor_details")
@EntityListeners(AuditingEntityListener.class)
public class VendorDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vendor_id")
	private int vendorId;
	
	@Column(name="name",length=200)
	private String name;

	@Column(name="email",length=100)
	private String email;
	
	@Column(name="mobile",length=13)
	private String mobile;
	
	@Column(name="password",length=50)
	private String password;
	
	@Column(name="profile_pic",length=100)
	private String profilePic;
	
	@Column(name="del_status")
	private int delStatus;

	@Column(name="address")
	private String address;
	

	@Column(name="nick_name")
	private String nickName;
	
	@Column(name = "date_time")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date dateTime;
	
	
	/** Last modified date */
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="driving_lic_pic")
	private String drivingLicPic;
	
//Other Document picture -aadhar,voter id
	@Column(name="other_doc_pic")
	private String otherDocPic;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getDrivingLicPic() {
		return drivingLicPic;
	}

	public void setDrivingLicPic(String drivingLicPic) {
		this.drivingLicPic = drivingLicPic;
	}

	public String getOtherDocPic() {
		return otherDocPic;
	}

	public void setOtherDocPic(String otherDocPic) {
		this.otherDocPic = otherDocPic;
	}

	public Date getDateTime() {
		return dateTime;
	}

 

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	 

	@Override
	public String toString() {
		return "VendorDetails [vendorId=" + vendorId + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + ", profilePic=" + profilePic + ", delStatus=" + delStatus + ", address="
				+ address + ", nickName=" + nickName + ", dateTime=" + dateTime + ", lastModifiedDate="
				+ lastModifiedDate + ", drivingLicPic=" + drivingLicPic + ", otherDocPic=" + otherDocPic + "]";
	}
 
	
	
	

	
}

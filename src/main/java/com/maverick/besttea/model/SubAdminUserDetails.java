package com.maverick.besttea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_admin_details")
public class SubAdminUserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "SubAdminUserDetails [userId=" + userId + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + ", profilePic=" + profilePic + ", delStatus=" + delStatus + "]";
	}


}

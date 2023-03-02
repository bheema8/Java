package com.jsp.tmr.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Component
@Entity
public class UserEntity {

	public UserEntity() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uId;
	private String userName;
	private String password;
	private String emailId;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "UserEntity [uId=" + uId + ", userName=" + userName + ", password=" + password + ", emailId=" + emailId
				+ "]";
	}
	

}

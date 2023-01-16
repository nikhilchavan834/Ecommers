package com.entity;

import java.util.Scanner;

public class User {
	private String username;
    private String userEmailId;
	private float userPhone; 
	private String userAddress;
	private String userpassword;
	
	//getter and setter
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getEmailId() {
		return userEmailId;
	}
	public void setEmailId(String emailId) {
		this.userEmailId = emailId;
	}
	public float getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(float userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getPassword() {
		return userpassword;
	}
	public void setPassword(String userPassword) {
		this.userpassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + username + ", emailId=" + userEmailId + ", userPhone=" + userPhone + ", userAddress="
				+ userAddress + ", password=" + userpassword + "]";
	}
	 
}

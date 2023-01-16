package com.admin;

public class Admin {
	private String adminname;
	private String adminemailId;
	private String adminpassword;
	
	public String getAdminName() {
		return adminname;
	}
	public void setAdminName(String adminName) {
		this.adminname = adminName;
	}
	
	public String getAdminemailId() {
		return adminemailId;
	}
	public void setAdminemailId(String adminemailId) {
		this.adminemailId = adminemailId;
	}
	public String getAdminPassword() {
		return adminpassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminpassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminname=" + adminname + ", adminemailId=" + adminemailId + ", adminpassword=" + adminpassword
				+ "]";
	}

    
	
	

}

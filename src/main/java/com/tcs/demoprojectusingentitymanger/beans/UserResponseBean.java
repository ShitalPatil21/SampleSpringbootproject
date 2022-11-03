package com.tcs.demoprojectusingentitymanger.beans;

import java.util.List;




public class UserResponseBean {
	private List<UserBean> userBean;
	
	public List<UserBean> getUserBean() {
		return userBean;
	}
	public void setUserBean(List<UserBean> userBean) {
		this.userBean = userBean;
	}
	private int statuscode;
	private String message;
	private String description;
		public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

}

package com.tcs.demoprojectusingentitymanger.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity

public class UserBean {

	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int userId;

		
		public int getUserId() {
			return userId;
		}



		public void setUserId(int userId) {
			this.userId = userId;
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



		public String getPhoneNo() {
			return phoneNo;
		}



		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		private String userName;

	

		@Column
		private String password;

		private String phoneNo;

		

		@Column(unique = true, name = "email")
		private String email;
}

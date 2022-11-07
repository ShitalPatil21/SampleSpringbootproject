package com.tcs.demoprojectusingentitymanger.dao;

import java.util.List;

import com.tcs.demoprojectusingentitymanger.beans.UserBean;

public interface UserDao {
	
	public boolean addUser(UserBean userBean);
	public List<UserBean> getAllUser() ;
	
	

}

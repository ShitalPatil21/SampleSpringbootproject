package com.tcs.demoprojectusingentitymanger.service;

import java.util.List;

import com.tcs.demoprojectusingentitymanger.beans.UserBean;

public interface UserService {
	public boolean addUser(UserBean userBean);
	public List<UserBean> getallUsers();
	

}

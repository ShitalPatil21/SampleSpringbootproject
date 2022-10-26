package com.tcs.samplespringbootproject.service;

import java.util.List;

import com.tcs.samplespringbootproject.beans.UserBean;

public interface UserService {
	
	public boolean addUser(UserBean userBean);
	
	public List<UserBean> getAllUsers();
	
	public boolean deleteUser(int UserID);
	
	public boolean updateUser(UserBean userbean,int userId);

}

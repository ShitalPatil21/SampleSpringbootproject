package com.tcs.samplespringbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.samplespringbootproject.beans.UserBean;
import com.tcs.samplespringbootproject.dao.UserRepository;
import com.tcs.samplespringbootproject.exception.UserException;
import com.tcs.samplespringbootproject.service.UserService;

@Component
public class UserUtility {

	private static UserService userSe;
	
	@Autowired
	static
	UserRepository userDao;
	
	@Autowired
	public UserUtility(UserService userService) {
		// TODO Auto-generated constructor stub
		UserUtility.userSe=userService;
	}
	
	
	public static List<UserBean> getAllUsers() {
		List<UserBean> AL=null;
		// TODO Auto-generated method stub
		try {
			
			AL=userDao.findAll();
			if(AL==null)
			return AL;
			
		} catch (Exception e) {
			// TODO: handle exception
	throw new UserException("Users are not present");
		}
		return AL;
		
	}
}

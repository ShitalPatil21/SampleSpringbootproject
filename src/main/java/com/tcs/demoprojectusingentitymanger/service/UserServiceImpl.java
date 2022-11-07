package com.tcs.demoprojectusingentitymanger.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.demoprojectusingentitymanger.beans.UserBean;

import com.tcs.demoprojectusingentitymanger.dao.UserDao;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserDao userDao;
	
	public boolean addUser(UserBean userBean) {
		
		boolean isAdded=userDao.addUser(userBean);
		return isAdded;
		
	}
	
	


	@Override
	public List<UserBean> getallUsers() {
		
		System.out.println("Inside Service GetAlluse");
		// TODO Auto-generated method stub
		return UserUtility.getAllUser();
	}


	

	

	
}

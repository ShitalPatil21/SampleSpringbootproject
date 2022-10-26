package com.tcs.samplespringbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.samplespringbootproject.beans.UserBean;
import com.tcs.samplespringbootproject.dao.UserRepository;
import com.tcs.samplespringbootproject.exception.UserException;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserRepository userDao;
	
	@Override
	public boolean addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
		 flag=	userDao.save(userBean) != null;
		}
		catch (Exception e) {
			// TODO: handle exception
			
			throw new UserException("Email already Exists");
		}
		
		return flag;
	}

	@Override
	public List<UserBean> getAllUsers() {
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

	@Override
	public boolean deleteUser(int UserID) {
		boolean flag=false;
		// TODO Auto-generated method stub
		try {
			userDao.deleteById(UserID);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			throw new UserException("User Not Found");
		}
		
		return false;
	}

	@Override
	public boolean updateUser(UserBean userbean,int userId) {
		// TODO Auto-generated method stub
		boolean isUpdate =false;
		try {
		UserBean userBean1=userDao.findById(userId).get();
		if(userbean.getEmail()!=null) {
			userBean1.setEmail(userbean.getEmail());
			
		}
		if(userbean.getPhoneNo()!=null) {
			userBean1.setPhoneNo(userbean.getPhoneNo());
		}
		
		
		if(userbean.getUserName()!=null) {
			userBean1.setUserName(userbean.getUserName());
		}
		
			 userDao.save(userBean1) ;
			 isUpdate=true;
		
		} catch (Exception e) {
			// TODO: handle exceptiotr
			throw new UserException("User Id not present");
		}
		return isUpdate;
	}
}

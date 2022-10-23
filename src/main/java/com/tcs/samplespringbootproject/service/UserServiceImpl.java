package com.tcs.samplespringbootproject.service;

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

}

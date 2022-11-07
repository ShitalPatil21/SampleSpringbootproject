package com.tcs.demoprojectusingentitymanger.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.demoprojectusingentitymanger.beans.UserBean;
import com.tcs.demoprojectusingentitymanger.service.UserService;

@Component
public class UserUtility {

	
	private static UserService userSe;
	
	@Autowired
	public UserUtility(UserService userService) {
		// TODO Auto-generated constructor stub
		UserUtility.userSe=userService;
	}
	
	@Autowired
	static
	EntityManagerFactory entityManagerFactory;
	public static  List<UserBean> getAllUser(){
		List<UserBean> userList = null;
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from UserBean";
			Query query = entityManager.createQuery(jpql);
			userList = (List<UserBean>) query.getResultList();
		
		} catch (Exception e) {
			e.getMessage();
		}
		return userList;
	}
	
	
	
}

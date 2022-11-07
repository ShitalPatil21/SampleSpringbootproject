package com.tcs.demoprojectusingentitymanger.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.demoprojectusingentitymanger.beans.UserBean;
import com.tcs.demoprojectusingentitymanger.service.UserService;

@Component
public class UserUtility {

	@Autowired
	private static UserService userSe;
	
	private static UserService userservice;
	
	/*
	 * @Autowired public UserUtility(UserService userService) { // TODO
	 * Auto-generated constructor stub UserUtility.userSe=userService;
	 * 
	 * 
	 * }
	 */
	@PostConstruct
	public void init() {
		System.out.println("Inside Init method");
		this.userSe = userservice;
		
	}

	@Autowired
	static EntityManagerFactory ef;
	
	public static  List<UserBean> getAllUser(){
		List<UserBean> userList = null;
		
		System.out.println("Before EntityManger");
		EntityManager entityManager = ef.createEntityManager();
		System.out.println("After EntityManger");
		try {
			System.out.println("Insidetry 1");
			String jpql = "from UserBean";
			Query query = entityManager.createQuery(jpql);
			userList = (List<UserBean>) query.getResultList();
		
		} catch (Exception e) {
			e.getMessage();
		}
		return userList;
	}
	
	
	
}

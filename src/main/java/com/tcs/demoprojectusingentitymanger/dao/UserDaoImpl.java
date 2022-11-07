package com.tcs.demoprojectusingentitymanger.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.tcs.demoprojectusingentitymanger.beans.UserBean;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean addUser(UserBean userBean) {
		boolean isAdded = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(userBean);
			entityTransaction.commit();
			isAdded = true;
		} catch (Exception e) {
			entityTransaction.rollback();
			
		}
		return isAdded;
	}
	
	@Override
	public List<UserBean> getAllUser() {
		List<UserBean> userList = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from UserBean";
			Query query = entityManager.createQuery(jpql);
			userList = (List<UserBean>) query.getResultList();
			if (userList == null || userList.isEmpty()) {
				
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return userList;
	}

}

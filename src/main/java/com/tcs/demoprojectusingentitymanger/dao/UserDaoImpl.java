package com.tcs.demoprojectusingentitymanger.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

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

}

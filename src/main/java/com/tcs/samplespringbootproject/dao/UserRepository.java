package com.tcs.samplespringbootproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.samplespringbootproject.beans.UserBean;

@Repository
public interface UserRepository extends JpaRepository<UserBean, Integer> {
	
	
}
package com.tcs.samplespringbootproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tcs.samplespringbootproject.beans.UserBean;
import com.tcs.samplespringbootproject.exception.UserException;
import com.tcs.samplespringbootproject.service.UserServiceImpl;

@SpringBootTest
class SamplespringbootprojectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	public void testAddUser() {
		UserBean userBean = new UserBean();
		userBean.setEmail("aayush1@gmail.com");
		userBean.setPassword("shitu@123");
		userBean.setPhoneNo("566777");
		userBean.setUserName("abc");
		boolean user = userServiceImpl.addUser(userBean);
		assertEquals(true, user);
	}
	
	@Test
	public void testAddUserInvalid() {
		UserBean userBean = new UserBean();
		userBean.setEmail("abc@gmail.com");		//Existing  email
		
		userBean.setPassword("Rohit@123");
		userBean.setPhoneNo("8857863105");
		userBean.setUserName("Rohit");
		
		assertThrows(UserException.class, ()-> {
			userServiceImpl.addUser(userBean);
		});
	}
	
	@Test
	public void getAllUser() throws UserException{
		boolean flag=false;
		List<UserBean> users=userServiceImpl.getAllUsers();
		if(users!=null) {
			flag=true;
			assertEquals(true, flag);
		}
	}
	
	@Test
	public void testDeleteUser() throws UserException {
		boolean i =userServiceImpl.deleteUser(22);
		assertEquals(true,i);
	}
	
	//invalid
	@Test
	public void testDeleteUserInvalid() throws UserException {
		assertThrows(UserException.class,()->{
			userServiceImpl.deleteUser(7);
		});
	}
	
	
	@Test
	public void testUpdateUser() {
		UserBean userBean = new UserBean();
		userBean.setEmail("sam@gmail.com");
		userBean.setPassword("sam@123");
		userBean.setPhoneNo("566777");
		userBean.setUserName("abc");
		boolean isUpdate=userServiceImpl.updateUser(userBean, 16);
		assertEquals(true, isUpdate);
	}

	@Test
	public void testUpdateUSerInvalid() {
		UserBean userBean = new UserBean();

		
		userBean.setEmail("sam@gmail.com");
		userBean.setPassword("sam@123");
		userBean.setPhoneNo("566777");
		userBean.setUserName("abc");
		assertThrows(UserException.class, () -> {
			userServiceImpl.updateUser(userBean, 2);
		});
	}

}

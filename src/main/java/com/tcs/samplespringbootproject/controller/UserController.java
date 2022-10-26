package com.tcs.samplespringbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.samplespringbootproject.beans.UserBean;
import com.tcs.samplespringbootproject.beans.UserResponseBean;
import com.tcs.samplespringbootproject.service.UserService;



@RestController
public class UserController {

	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public UserResponseBean register(@RequestBody UserBean userBean) {
		UserResponseBean userResponseBean = new UserResponseBean();
		
		userService.addUser(userBean);
	
		userResponseBean.setStatuscode(200);
		userResponseBean.setMessage("sucess");
		userResponseBean.setDescription("user Added Successfully");
		return userResponseBean;
	}

	@GetMapping("/getAllUsers")
	
	public UserResponseBean getAllUsers() {
		
		UserResponseBean userResponseBean = new UserResponseBean();
		
		List<UserBean> userbean=userService.getAllUsers();
		userResponseBean.setStatuscode(200);
		userResponseBean.setMessage("sucess");
		userResponseBean.setUserBean(userbean);
		
		return userResponseBean;
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public UserResponseBean deleteUser(@PathVariable("userId")int userId) {
		boolean isDeleted=false;
		UserResponseBean userResponseBean = new UserResponseBean();
		 userService.deleteUser(userId);
		 userResponseBean.setStatuscode(200);
			userResponseBean.setMessage("sucess");
			userResponseBean.setDescription("user deleted Successfully");
		 return userResponseBean;
	}
	
	
	@PutMapping("/updateuser/{id}")
	public UserResponseBean updateUser(@RequestBody UserBean userBean, @PathVariable("id") int id)
	{
		userService.updateUser(userBean, id);
		
		UserResponseBean userResponseBean = new UserResponseBean();
		
		
		 userResponseBean.setStatuscode(200);
			userResponseBean.setMessage("sucess");
			userResponseBean.setDescription("user updated Successfully");
			
		 return userResponseBean;
		
		
		
	}
	
	
}

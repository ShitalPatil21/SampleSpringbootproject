package com.tcs.samplespringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

	
	
}

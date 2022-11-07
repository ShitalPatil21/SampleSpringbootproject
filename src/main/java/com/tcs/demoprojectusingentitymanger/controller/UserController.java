package com.tcs.demoprojectusingentitymanger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.demoprojectusingentitymanger.beans.UserBean;
import com.tcs.demoprojectusingentitymanger.beans.UserResponseBean;
import com.tcs.demoprojectusingentitymanger.service.UserService;
import com.tcs.demoprojectusingentitymanger.service.UserServiceImpl;
import com.tcs.demoprojectusingentitymanger.service.WelcomeService;

@RestController
@RequestMapping("/welcome")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	WelcomeService welcomeservice;
	
	@GetMapping
	public String getmessage() {
		return welcomeservice.getWelcomeMessage();
	}
	@PostMapping("/addUser")
	public UserResponseBean register(@RequestBody UserBean userBean) {
		UserResponseBean userResponseBean = new UserResponseBean();
		
		userService.addUser(userBean);
	
		
		  userResponseBean.setStatuscode(200); userResponseBean.setMessage("sucess");
		  userResponseBean.setDescription("user Added Successfully");
		  return userResponseBean;
		 
		
		// return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.OK);
	}

	@GetMapping("/getAllUsers")
	public UserResponseBean getAllUsers() {
		UserResponseBean userResponseBean = new UserResponseBean();

		List<UserBean> userbean = userService.getallUsers();
		userResponseBean.setStatuscode(200);
		userResponseBean.setMessage("sucess");
		userResponseBean.setUserBean(userbean);

		return userResponseBean;
	}
	
	@GetMapping("/getAllUsers1")
	public UserResponseBean getAllUsers1() {
		UserResponseBean userResponseBean = new UserResponseBean();

		List<UserBean> userbean = userService.getallUsers();
		userResponseBean.setStatuscode(200);
		userResponseBean.setMessage("sucess");
		userResponseBean.setUserBean(userbean);

		return userResponseBean;
	}
}

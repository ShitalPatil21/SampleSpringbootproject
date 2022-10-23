package com.tcs.samplespringbootproject.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tcs.samplespringbootproject.beans.UserResponseBean;
import com.tcs.samplespringbootproject.exception.UserException;


@RestControllerAdvice
public class UserAdviceController {

	
	@ExceptionHandler()
	public UserResponseBean userException(UserException e) {
		UserResponseBean response = new UserResponseBean();
		response.setStatuscode(401);
		response.setMessage("Failer");
		response.setDescription(e.getMessage());
		return response;
	}
}

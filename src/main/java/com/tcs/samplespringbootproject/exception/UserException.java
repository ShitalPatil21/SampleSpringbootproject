package com.tcs.samplespringbootproject.exception;

public class UserException extends RuntimeException {

	
	String message ;

	public UserException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	
}

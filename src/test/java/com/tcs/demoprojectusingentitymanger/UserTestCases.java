package com.tcs.demoprojectusingentitymanger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.demoprojectusingentitymanger.service.WelcomeService;

@ExtendWith(MockitoExtension.class)
public class UserTestCases {
	@Autowired
	  WelcomeService welcomeService;
	 
	 @Test
	 void welcomeservice() {
		 String message=welcomeService.getWelcomeMessage();
		 
		 assertEquals(message, "Welcome To Application");
	 }

}

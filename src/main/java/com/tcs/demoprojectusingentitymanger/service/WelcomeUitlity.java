package com.tcs.demoprojectusingentitymanger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.demoprojectusingentitymanger.service.WelcomeService;

@Component
public class WelcomeUitlity {

	
	private static WelcomeService welocme;
	
	@Autowired
	public WelcomeUitlity(WelcomeService welcomeService) {
		this.welocme=welcomeService;
		
	}
	
	public static String getWelcomeMessage() {
		
		String meeessage=welocme.welcomeToOurapplication();
		return meeessage;
	}
	
	
}

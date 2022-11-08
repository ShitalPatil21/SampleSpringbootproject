package com.tcs.demoprojectusingentitymanger.service;

import org.springframework.stereotype.Service;


@Service
public class WelcomeServiceImpl  implements WelcomeService{

	@Override
	public String getWelcomeMessage() {
		// TODO Auto-generated method stub
		return ""+WelcomeUitlity.getWelcomeMessage();
	}

	@Override
	public String welcomeToOurapplication() {
		// TODO Auto-generated method stub
		return "Welcome To Application";
	}

}

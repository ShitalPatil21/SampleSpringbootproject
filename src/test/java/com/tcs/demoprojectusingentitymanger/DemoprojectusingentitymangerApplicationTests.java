package com.tcs.demoprojectusingentitymanger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.tcs.demoprojectusingentitymanger.service.WelcomeService;
import com.tcs.demoprojectusingentitymanger.service.WelcomeUitlity;

@SpringBootTest

class DemoprojectusingentitymangerApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	
	 
	 @Test
	public void welcomeservice() {
		 
		
		    String actualcall = WelcomeUitlity.getWelcomeMessage(); 
		    System.out.println(actualcall);
		
		 try (MockedStatic mockStatic = Mockito.mockStatic(WelcomeUitlity.class)) {

			    mockStatic.when(WelcomeUitlity::getWelcomeMessage);

			    //Inside scope
			    assertEquals(actualcall, WelcomeUitlity.getWelcomeMessage());
			    mockStatic.verify(WelcomeUitlity::getWelcomeMessage);
			  }
	 }
	 

	

	 

	  //Outside scope
	  

}

package com.java.zumair.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.zumair.demo.exception.UsernameNotFoundExpection;
import com.java.zumair.demo.service.CallService;
import com.java.zumair.demo.service.UserService;

@SpringBootTest
class OfflineTestingApplicationTests {
    @Autowired
	CallService callservice;
    
    @Autowired
    UserService userservice;
	@Test
	void testAddNumber() {
		assertEquals(callservice.addNumber(3, 7), 10);
	}
	

	@Test
	void userWithCorrectCreadentail()  throws UsernameNotFoundExpection{
		assertTrue(userservice.isUserValid("Amit", "123"));
		
	}
	@Test
	void nonExistingUserLoginGeneratesException() throws UsernameNotFoundExpection {
		UsernameNotFoundExpection ex=Assertions.assertThrows(  UsernameNotFoundExpection.class, ()->userservice.isUserValid("dsjaj","sjhjh"));
		
		assertEquals(ex.getMessage(),"the user does not exists");
		
	}


}

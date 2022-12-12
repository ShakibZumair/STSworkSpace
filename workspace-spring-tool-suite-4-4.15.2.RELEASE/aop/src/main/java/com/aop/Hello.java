package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.AopService;

public class Hello {

	public static void main(String[] args) {
//   System.out.println("Hello Welcome to AOP ");

	ApplicationContext context= new ClassPathXmlApplicationContext("com/aop/config.xml");
	AopService payment=context.getBean("payment",AopService.class);
	payment.makePayment(500);
	}

}

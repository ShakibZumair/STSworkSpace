package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before ("execution(* com.aop.service.impl.AopServiceImpl.makePayment(.. ))")
 public void beforePayment() {
	 System.out.println("Payment is in proccess");
 }
	@After ("execution(* com.aop.service.impl.AopServiceImpl.makePayment(..))")
	 public void afterPayment() {
		 System.out.println("Payment is completed");
	 }
}


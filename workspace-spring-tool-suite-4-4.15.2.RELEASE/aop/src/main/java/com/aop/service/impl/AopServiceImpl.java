package com.aop.service.impl;

import com.aop.service.AopService;

public class AopServiceImpl implements AopService {

//	public void makePayment() {
//		System.out.println("Ammout is debeted");
//		System.out.println("Ammout is Creadeted");
//
//	}
	public void makePayment(int amount) {
		System.out.println(amount  +" ->Ammout is debeted to your bank");
		System.out.println(amount  +" ->Ammout is Creadeted to party ");

	}

}

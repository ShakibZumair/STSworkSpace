package com.java.zumair.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CallServiceImpl implements CallService {

	@Override
	public int addNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int maxNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i<j?i:j;
	}

}

package com.example.demo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.model.Product;

public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Product product=(Product) target;
		if(product.getName().length()>10 || product.getName().length()<40) {
			
		}
	}

}

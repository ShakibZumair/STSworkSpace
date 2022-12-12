package com.example.java.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java.demo.Repository.ProductRepo;
import com.example.java.demo.model.Product;

@Service
public class ProductServiceimpl implements ProductService {
	@Autowired
	ProductRepo productrepo;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productrepo.getAllProduct();
	}

}

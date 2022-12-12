package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;

public interface ProductService {
	public List<Product> getAllProduct();
//	public List<Product> getProductByCategory(String category);
 //   public  Product getProductById(String productId);
	public  Product getProductById(String productId) throws ProductNotFoundException;
}

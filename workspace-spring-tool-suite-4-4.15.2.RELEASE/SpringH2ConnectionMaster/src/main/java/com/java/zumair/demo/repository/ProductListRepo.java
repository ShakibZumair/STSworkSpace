package com.java.zumair.demo.repository;

import java.util.List;

import com.java.zumair.demo.model.Product;



public interface ProductListRepo {
	List<Product> getAllProduct();

	Product getProductbyId(String id);

	void addProduct(Product prod);

	void deleteProduct(String id);
	

}

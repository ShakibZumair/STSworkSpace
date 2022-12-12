package com.example.java.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.demo.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	public Product findByName(String name);


	
}

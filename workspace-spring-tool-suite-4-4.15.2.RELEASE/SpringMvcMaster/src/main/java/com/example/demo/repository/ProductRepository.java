package com.example.demo.repository;

import java.util.List;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;

public interface ProductRepository {

public List<Product> getAllProduct();
//public  List<Product> getProductsByCategory(String category);
//public Product getProductById(String productId);
public Product getProductById(String productId) throws ProductNotFoundException;
}

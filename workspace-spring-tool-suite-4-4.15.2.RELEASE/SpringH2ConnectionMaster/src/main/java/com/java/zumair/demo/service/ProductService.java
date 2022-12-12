package com.java.zumair.demo.service;

import java.util.List;

import com.java.zumair.demo.model.Product;

public interface ProductService {
List <Product> getAllProduct();

List <Product> getProductByCategory(String category);
Product getProductById(String productId);
void addProduct(Product prod);
}

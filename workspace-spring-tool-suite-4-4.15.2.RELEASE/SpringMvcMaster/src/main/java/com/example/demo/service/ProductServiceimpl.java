package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceimpl implements ProductService {
	@Autowired
	ProductRepository productrepository;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub

		System.out.println("servic..call");
		return productrepository.getAllProduct();

	}

	@Override
	public Product getProductById(String productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		
		return productrepository.getProductById(productId);
	}

//	@Override
//	public List<Product> getProductByCategory(String category) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	==========================================
//    @Override
//    public Product getProductById(String productId) {
//        // TODO Auto-generated method stub
//        
//        
//        return productrepository.getProductById(productId);
//    }
}

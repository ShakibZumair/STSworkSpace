package com.example.java.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java.demo.model.Product;
import com.example.java.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productrepo;
 
	public Product saveProduct(Product product) {
		return productrepo.save(product);

	}

	public List<Product> saveProducts(List<Product> products) {
		return productrepo.saveAll(products);
	}

	public List getAllproduct() {
		return productrepo.findAll();
	}

	public Product getProductById(int id) {
		return productrepo.findById(id).orElse(null);
	}

	public Product getProductByName(String name) {
		return productrepo.findByName(name);

	}

	public Product upateProduct(Product product) {
		Product p = productrepo.findById(product.getProductId()).orElse(null);
		p.setPrice(product.getPrice());
		p.setProductName(product.getProductName());
		p.setQuantity(product.getQuantity());
		return productrepo.save(p);
	}

	public String deleteProduct(int id) {
		productrepo.deleteById(id);
		return "Id is deleted" + id;
	}

}

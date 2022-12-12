package com.example.java.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.demo.model.Product;
import com.example.java.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productservice.saveProduct(product);
	}

	@PostMapping("/addAll")
	public List<Product> addAllProducts(@RequestBody List<Product> products) {
		return productservice.saveProducts(products);
	}

	@GetMapping("/getProduct")
	public List<Product> getProduct() {
		return productservice.getAllproduct();
	}

	@GetMapping("/getProduct/{id}")
	public Product getById(@PathVariable int id) {
		return productservice.getProductById(id);
	}

	@GetMapping("/getProduct/{name}")
	public Product getByI(@PathVariable String name) {
		return productservice.getProductByName(name);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.saveProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productservice.deleteProduct(id);

	}

}

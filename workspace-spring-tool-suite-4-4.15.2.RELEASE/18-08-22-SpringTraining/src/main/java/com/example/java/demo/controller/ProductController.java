package com.example.java.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.java.demo.model.Product;
import com.example.java.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productservice;

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public String getAllProduct(ModelMap model) {
		List<Product> product = productservice.getAllProduct();
		model.addAttribute("products", product);
		return "allproduct";

	}
}

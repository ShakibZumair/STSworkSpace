package com.java.zumair.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.zumair.demo.model.Product;
import com.java.zumair.demo.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService pc;

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public String getAllProduct(ModelMap model) {
		model.addAttribute("products", pc.getAllProduct());
		return "allproduct";

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/all/{category}")
	public String getAllProductByCategory(ModelMap model ,@PathVariable("category") String category ) {
		model.addAttribute("products", pc.getProductByCategory(category));
		return "allproduct";

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/get")
	public String getAllProductById(ModelMap model ,@RequestParam("id") String id ) {
		model.addAttribute("products", pc.getProductById(id));
		return "oneproduct";

	}
//	@RequestMapping(method = RequestMethod.GET, value = "/add")
//	public String displayAddProductFrom (ModelMap model) {
//		model.addAttribute("newProduct" ,new Product());
//		return "addProduct";
//		
//	}
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public String displayAddProductFrom (ModelMap model) {
		Product p1=new Product();
		p1.setName("my product");
		model.addAttribute("newProduct" ,p1);
		return "addProduct";
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String addProduct(@ModelAttribute("newProduct") Product product) {
		pc.addProduct(product);
		return "redirect:/products/all";
		
	}
}



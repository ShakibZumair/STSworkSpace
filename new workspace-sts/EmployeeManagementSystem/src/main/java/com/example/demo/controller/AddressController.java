//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.demo.model.Address;
//import com.example.demo.service.AddressService;
//
//@Controller
//@RequestMapping("/api/v1")
//public class AddressController  {
//	@Autowired
//	AddressService addressService;
//	
//	
//	@PostMapping("/address")
//	public Address createEmployee (@RequestBody Address address) {
//		return addressService.createEmployee(address);
//	}
//}

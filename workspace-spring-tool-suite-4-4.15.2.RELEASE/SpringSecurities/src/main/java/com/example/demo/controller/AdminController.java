package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")

public class AdminController {

	@RequestMapping(method = RequestMethod.GET, value = "/Hello")
	public String AdminController() {

		return "user";
	}
}

package com.example.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class FirstController {
@RequestMapping ("/hello")
	public String hello() {
		return "Hello Developer";
}
}

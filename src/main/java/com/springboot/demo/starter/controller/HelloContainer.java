package com.springboot.demo.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi Yash";
	}

}

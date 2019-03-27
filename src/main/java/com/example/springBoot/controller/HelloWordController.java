package com.example.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@RequestMapping(value ="/hello")
	public String index(){
		return "hello word";
	}
	
}

package com.example.demo.restapi.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class MyService {

	@GetMapping("/myService")
	public String myService() {
		return "response restController~~~~12";
	}
	
}

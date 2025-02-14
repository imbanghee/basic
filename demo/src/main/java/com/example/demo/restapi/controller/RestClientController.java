package com.example.demo.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/restClient")
	public String getMyService() {
		String url = "http://localhost:8080/restapi/myService";
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		String returnStr = responseEntity.getBody() + " OK";
		return returnStr;
	}
	
}

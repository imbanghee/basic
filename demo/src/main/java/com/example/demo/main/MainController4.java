package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController4 {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}

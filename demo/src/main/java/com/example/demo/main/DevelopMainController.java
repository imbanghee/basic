package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevelopMainController {
	@GetMapping("/")
	public String hello() {
		return "main";
	}
}

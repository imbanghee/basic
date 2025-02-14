package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafTest {

	@GetMapping("/thymeleaf")
	public String index() {
		return "index";
	}
	
	@GetMapping("/thymeleaf_var")
	public String thymeleaf_var(Model model) {
		model.addAttribute("name", "banghee im");
		return "thymeleaf_var";
	}
}

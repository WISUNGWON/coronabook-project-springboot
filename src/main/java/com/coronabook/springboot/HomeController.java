package com.coronabook.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value= "/")
	public String Hello (Model model) {
		return "index";
	}
}

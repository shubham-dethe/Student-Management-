package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@PostMapping("calculator")
	String newAddition() {
		
		return "Addition method";
	}

}

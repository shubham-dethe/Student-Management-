package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebCalci {
	
	
	@GetMapping("add/{a}/{b}")
	int add(@PathVariable("a") int a, @PathVariable("b") int b)
	{
		return a+b;
	}
	
	@GetMapping("sub/{a}/{b}")
	int sub(@PathVariable("a") int a, @PathVariable("b") int b)
	{
		return a-b;
	}
	
	
	@GetMapping("mul/{a}/{b}")
	int mul(@PathVariable("a") int a, @PathVariable("b") int b)
	{
		return a*b;
	}
	
	
	@GetMapping("div/{a}/{b}")
	int div(@PathVariable("a") int a, @PathVariable("b") int b)	{
		return a/b;
	}
	
	@GetMapping("addition/{a}/{b}")
	int addition(@PathVariable("a") int a, @PathVariable("b") int b)
	{
		return a+b;
	}
	
	
	

}

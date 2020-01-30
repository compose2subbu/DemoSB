package com.example.Demo.basicControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {
	
	@GetMapping("ck")
	public String check()
	{
		return "Check";
	}
	
	@GetMapping("")
	public String welcome()
	{
		return "Welcome to Spring Boot Demo Application. Goto http://localhost:8082/swagger-ui.html for swagger";
	}

}

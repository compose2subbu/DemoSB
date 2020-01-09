package com.example.Demo.basicControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {
	
	@RequestMapping("ck")
	public String check()
	{
		return "Check";
	}

}

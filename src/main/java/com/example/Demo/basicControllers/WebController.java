package com.example.Demo.basicControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("")
	public String welcome()
	{
		return "welcome";
	}
	
	@GetMapping("error")
	public String error()
	{
		return "Unexpected Error occurred. Check the logs for details.";
	}

}

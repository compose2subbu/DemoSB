package com.example.Demo.basicControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@PostMapping("getsum")
	public String doSum(@RequestParam("num01") int num01, @RequestParam("num02") int num02, ModelMap modelMap)
	{
		int sum = num01 + num02;
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(sum);
		modelMap.put("num01", num01);
		modelMap.put("num02", num02);
		modelMap.put("sum", sum);
		return "result";
	}
	
	@GetMapping("doadd")
	public String doSum()
	{
		return "sum";
	}


}

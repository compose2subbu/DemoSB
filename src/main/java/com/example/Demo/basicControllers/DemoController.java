package com.example.Demo.basicControllers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	int a = 10;
	int b = 5;
	
	@RequestMapping("chk")
	public String check()
	{
		return "Welcome to springboot";
	}
	
	@RequestMapping(value = "sum",method = RequestMethod.POST)
	public String sum()
	{
		int c = a+b;
		return "Welcome to springboot. The sum is "+c;
	}
	
	@RequestMapping(value = "postparam", method = RequestMethod.POST)
	public String readValue(@RequestBody String jsonRequest) throws ParseException
	{
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(jsonRequest);
		
		String firstName = (String) jsonObj.get("name");    
        System.out.println(firstName);
        
        String orgName = (String) jsonObj.get("org");    
        System.out.println(orgName);
        
        
		return "Employee "+firstName+" is employed in "+orgName;
	}
	
	@RequestMapping(value = "calculate", method = RequestMethod.POST)
	public JSONObject calculate(@RequestBody String jsonRequest) throws ParseException
	{
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(jsonRequest);
		JSONObject jsonResponse = new JSONObject();
		
		int a = Integer.parseInt((String) jsonObj.get("num1"));    
        System.out.println(a);
        
        int b = Integer.parseInt((String) jsonObj.get("num2"));    
        System.out.println(b);
        
        int addition = a+b;
        int subtraction = a-b;
        int multiply = a*b;
        float divide = a/b;
        
        jsonResponse.put("addition",addition);
        jsonResponse.put("subtraction",subtraction);
        jsonResponse.put("multiply",multiply);
        jsonResponse.put("divide",divide);
        
		return jsonResponse;
	}
}

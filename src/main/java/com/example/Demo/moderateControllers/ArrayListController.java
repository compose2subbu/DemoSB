package com.example.Demo.moderateControllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.moderateControllers.Employee;

@RestController
public class ArrayListController {
	
	@Autowired
	EmployeeServices dao;	
	
	@RequestMapping(value = "addemp",method = RequestMethod.POST)
	public boolean addEmp(@RequestBody Employee e)
	{
		return dao.save(e);
	}
	
	@GetMapping("fetchemps")
	public ArrayList<Employee> getEmp()
	{
		return dao.fetch();
	}
	
	@PostMapping("delbyobj")
	public boolean deleteEmpbyObj(@RequestBody Employee e)
	{
		return dao.deleteByObj(e);
	}
	
	@PostMapping("delbyindex")
	public Employee deleteEmpByIndex(@RequestBody int n)
	{
		return dao.deleteByIndex(n);
	}
	
	@PostMapping("delbyvalue")
	public boolean deleteEmpByInd(@RequestBody int n)
	{
		return dao.deleteByValue(n);
	}


}

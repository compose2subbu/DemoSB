package com.example.Demo.DBControllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired(required = false)
	EmpServices dao;
	
	@RequestMapping(value = "save",method = RequestMethod.POST)
	public boolean addEmp(@RequestBody Employee e)
	{
		return dao.save(e);
	}
	
	@PostMapping("/entitySave")
	public void entitySave(@RequestBody EmployeeEntity empRepo)
	{
		System.out.println("entered entity save for ID:"+empRepo.getId());
		dao.saveRepo(empRepo);
		System.out.println("saved DB elements");
	}
	
	@PostMapping("entityFetchbyemail")
	public List<EmployeeEntity> entityFetchByEmail(@RequestBody EmployeeEntity empRepo)
	{
		return dao.fetchRepoByEmail(empRepo);
	}
	
	@PostMapping("entityFetchbyname")
	public List<EmployeeEntity> entityFetchByName(@RequestBody EmployeeEntity empRepo)
	{
		return dao.fetchRepoByName(empRepo);
	}
	
	@PostMapping("entityFetchbyid")
	public Optional<EmployeeEntity> entityFetchById(@RequestBody EmployeeEntity empRepo)
	{
		return dao.fetchRepoById(empRepo);
	}
	
	@PostMapping("entitydelbyemail")
	public List<EmployeeEntity> entityDeleteByEmail(@RequestBody EmployeeEntity empRepo)
	{
		return dao.deleteRepoByEmail(empRepo);
	}
	
	@PostMapping("entitydelbyname")
	public List<EmployeeEntity> entityDeleteByName(@RequestBody EmployeeEntity empRepo)
	{
		return dao.deleteRepoByName(empRepo);
	}
	
	@PostMapping("entitydelbyid")
	public void entityDeleteById(@RequestBody EmployeeEntity empRepo)
	{
		dao.deleteRepoById(empRepo);
	}
}

package com.example.Demo.DBControllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpServices {

	
	  @Autowired(required = true) JdbcTemplate template;
	  
	  
	  @Autowired EmployeeRepository employeeRepo;
	 
	

	ArrayList<Employee> elist = new ArrayList<>();
	
	
	public boolean save(Employee e)
	{
		String sqlQuery = "insert into Employees value ('"+e.getId()+"','"+e.getName()+"','"+e.getEmail()+"')";
		System.out.println(sqlQuery);
		template.update(sqlQuery);
		//elist.add(e);
		return true;
	}
	
	public void saveRepo(EmployeeEntity empName) {
		System.out.println(empName.getName());
		employeeRepo.save(empName);
		/*
		 * employeeRepo.save(new EmployeeEntity("qwe"));
		 * 
		 * System.out.println("\nfindAll()"); employeeRepo.findAll().forEach(emp ->
		 * System.out.println(emp));
		 * 
		 * System.out.println("\nfindByemail('qwe@gmail.com')");
		 * employeeRepo.findByEmail("qwe@gmail.com").forEach(emp ->
		 * System.out.println(emp));
		 */
	}
	
	public List<EmployeeEntity> fetchRepoByEmail(EmployeeEntity empEntity) {		
		  System.out.println("\nfindByEmail('"+empEntity.getEmail()+"')");
		  return employeeRepo.findByEmail(empEntity.getEmail());
		 
	}
	
	public List<EmployeeEntity> fetchRepoByName(EmployeeEntity empEntity) {		
		  System.out.println("\nfindByName('"+empEntity.getName()+"')");
		  return employeeRepo.findByName(empEntity.getName());
		 
	}
	
	public Optional<EmployeeEntity> fetchRepoById(EmployeeEntity empEntity) {		
		  System.out.println("\nfindById('"+empEntity.getId()+"')");
		  return employeeRepo.findById(empEntity.getId());
		 
	}
	
	public List<EmployeeEntity> deleteRepoByEmail(EmployeeEntity empEntity) {		
		  System.out.println("\ndeleteByEmail('"+empEntity.getEmail()+"')");
		  return employeeRepo.deleteByEmail(empEntity.getEmail());
		 
	}
	
	public List<EmployeeEntity> deleteRepoByName(EmployeeEntity empEntity) {		
		  System.out.println("\ndeleteByName('"+empEntity.getName()+"')");
		  return employeeRepo.deleteByName(empEntity.getName());
		 
	}
	
	public void deleteRepoById(EmployeeEntity empEntity) {		
		  System.out.println("\ndeleteById('"+empEntity.getId()+"')");
		  employeeRepo.deleteById(empEntity.getId());
		 
	}

}

package com.example.Demo.DBControllers;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long>{
	
	ArrayList<EmployeeEntity> findByName(String name);
	
	ArrayList<EmployeeEntity> findByEmail(String name);
	
	ArrayList<EmployeeEntity> findById(String name);
	
	@Transactional
	ArrayList<EmployeeEntity> deleteByEmail(String name);
	
	@Transactional
	ArrayList<EmployeeEntity> deleteByName(String name);

}

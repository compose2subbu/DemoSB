package com.example.Demo.moderateControllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServices {
	ArrayList<Employee> elist = new ArrayList<>();
	
	
	public boolean save(Employee e)
	{
		elist.add(e);
		return true;
	}

	public ArrayList<Employee> fetch()
	{
		return elist;
	}

	public boolean deleteByObj(Employee e)
	{
		//not working
		return elist.remove(e);
	}
	
	public Employee deleteByIndex(int n)
	{
		return elist.remove(2);
	}
	
	public boolean deleteByValue(int n)
	{
		Employee IterationEmp;
		JSONParser parser = new JSONParser();
		try {
			System.out.println(elist);
			Iterator Itr = elist.iterator();
			int currentId = 0;
			while(Itr.hasNext())
			{
				IterationEmp = (Employee) Itr.next();
				

				if(IterationEmp.id == n) {
					System.out.println("Item Removed:"+IterationEmp.id);
					return elist.remove(IterationEmp);
				}
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public boolean updateByValue(Employee e)
	{
		Employee IterationEmp;
		JSONParser parser = new JSONParser();
		System.out.println(elist);
		Iterator Itr = elist.iterator();
		int currentId = 0;
		while(Itr.hasNext())
		{
			IterationEmp = (Employee) Itr.next();
			if(IterationEmp.id == e.id) {
				elist.remove(IterationEmp);
				return elist.add(e);
			}
		}
		return false;
	}
}

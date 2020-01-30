package com.example.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) { 
		Connection dbConnection = null; 
		try { String url = "jdbc:mysql://localhost:3306/sbdatabase"; 
		dbConnection = DriverManager.getConnection(url, "root","root123$"); 
		if (dbConnection != null) { 
			System.out.println("Successfully connected to MySQL database test"); } 
		} catch (SQLException ex) { System.out.println("An error occurred while connecting MySQL databse"); 
		ex.printStackTrace(); 
		}
		}
	}

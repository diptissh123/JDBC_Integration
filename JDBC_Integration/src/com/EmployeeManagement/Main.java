package com.EmployeeManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 EmployeeDAO employeeDAO = new EmployeeDAO();

	        employeeDAO.createTable();
		
	        try (Connection connection =
	                DatabaseConnection.getConnection()) {

	       System.out.println(
	               "Connected to MySQL successfully!");

	       System.out.println(
	               "Connection status: "
	               + !connection.isClosed());

	   } catch (SQLException e) {
	       System.out.println(
	               "Database connection failed: "
	               + e.getMessage());
	   }
	        
	        System.out.println("================================");
	        System.out.println("  Employee Management System");
	        System.out.println("================================");

	        System.out.print("Enter employee name: ");
	        String name = s.nextLine();

	        System.out.print("Enter employee email: ");
	        String email = s.nextLine();

	        System.out.print("Enter department: ");
	        String department = s.nextLine();

	        System.out.print("Enter salary: ");
	        double salary = s.nextDouble();

	        Employee employee = new Employee(
	                name, email, department, salary
	        );

	        employeeDAO.insertRecord(employee);

	        // Display all employee records
	        employeeDAO.getAllRecords();

	        s.close();


	      


		
	}

}

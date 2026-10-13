package com.EmployeeManagement;





import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {

    public void createTable() {

        String sql = "CREATE TABLE IF NOT EXISTS employees ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(150) NOT NULL UNIQUE, "
                + "department VARCHAR(100) NOT NULL, "
                + "salary DECIMAL(10,2) NOT NULL"
                + ")";

        try (Connection connection =
                     DatabaseConnection.getConnection();
             Statement statement =
                     connection.createStatement()) {

            statement.executeUpdate(sql);

            System.out.println(
                    "Employees table created successfully!");

        } catch (SQLException e) {
            System.err.println(
                    "Failed to create employees table: "
                    + e.getMessage());
        }
    }
    
    

    public void insertRecord(Employee employee) {

    	String sql = "INSERT INTO employees "
            + "(name, email, department, salary) "
            + "VALUES (?, ?, ?, ?)";

    	try (java.sql.Connection con =
                 	DatabaseConnection.getConnection();
    			java.sql.PreparedStatement ps =
    					con.prepareStatement(sql)) {

    		ps.setString(1, employee.getName());
    		ps.setString(2, employee.getEmail());
    		ps.setString(3, employee.getDepartment());
    		ps.setDouble(4, employee.getSalary());

    		int rows = ps.executeUpdate();

    		if (rows > 0) {
    			System.out.println("Employee inserted successfully!");
    		}

    	} catch (java.sql.SQLException e) {
    		System.err.println(
    				"Failed to insert employee: " + e.getMessage());
    	}
    }

    

    public void getAllRecords() {

    	String sql = "SELECT id, name, email, department, salary "
    			+ "FROM employees ORDER BY id";

    	try (java.sql.Connection con =
                 	DatabaseConnection.getConnection();
    			java.sql.PreparedStatement ps =
    					con.prepareStatement(sql);
    			java.sql.ResultSet rs = ps.executeQuery()) {

    		System.out.println("\n--- Employee Records ---");

    		boolean found = false;

    		while (rs.next()) {
    			found = true;

    			System.out.println(
    					"ID: " + rs.getInt("id")
    					+ " | Name: " + rs.getString("name")
    					+ " | Email: " + rs.getString("email")
    					+ " | Department: " + rs.getString("department")
    					+ " | Salary: " + rs.getBigDecimal("salary"));
    		}

    		if (!found) {
    			System.out.println("No employee records found.");
    		}

    	} catch (java.sql.SQLException e) {
    		System.err.println(
    				"Failed to retrieve employees: " + e.getMessage());
    }
}

}



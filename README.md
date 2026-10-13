# JDBC Integration – Employee Management System

## 📌 Project Overview

The JDBC Integration project is a Java-based application that connects to a MySQL database using Java Database Connectivity (JDBC). It demonstrates how to perform CRUD (Create, Read, Update, and Delete) operations to manage employee records.

## ✨ Features

- Create the employees table if it does not exist
- Insert employee records
- View all employee records
- Update employee details using employee ID
- Delete employee records using employee ID
- Accept user input through the console
- Use prepared statements for parameterized SQL queries
- Handle SQL exceptions and database errors

## 🛠️ Technologies Used

- Java 21
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J 9.7.0
- Eclipse IDE
- SQL

## 🗃️ Database Structure

**Database:** `company`

**Table:** `employees`

| Column | Data type | Description |
|---|---|---|
| id | INT | Primary key with auto-increment |
| name | VARCHAR(100) | Employee name |
| email | VARCHAR(150) | Unique employee email |
| department | VARCHAR(100) | Employee department |
| salary | DECIMAL(10,2) | Employee salary |

The database setup script is provided in `schema.sql`.

## 📂 Project Structure

```text
jdbc-integration/
├── src/
│   ├── DatabaseConnection.java
│   ├── Employee.java
│   ├── EmployeeDAO.java
│   └── Main.java
├── schema.sql
└── README.md
```

*Update this structure if your Java classes are inside a package or your project contains additional files.*

## ⚙️ Prerequisites

- JDK 21
- MySQL Server
- Eclipse IDE or another Java IDE
- MySQL Connector/J JDBC driver

## 🚀 Setup and Execution

1. Clone or download this repository.
2. Open MySQL Workbench and connect to your MySQL server.
3. Execute `schema.sql` to create the database and employees table.
4. Open the project in Eclipse and configure JDK 21.
5. Add the MySQL Connector/J JAR to the project's build path if it is not already configured.
6. Update the database URL, username, and password in `DatabaseConnection.java`.
7. Run `Main.java`.
8. Use the console menu to add, view, update, or delete employee records.

## 🔄 CRUD Operations

- **Create:** Insert employee details into MySQL.
- **Read:** Retrieve and display employee records.
- **Update:** Modify employee information by ID.
- **Delete:** Remove an employee record by ID.

## 📚 Concepts Learned

- JDBC database connectivity
- SQL queries and CRUD operations
- PreparedStatement and ResultSet
- DAO (Data Access Object) design
- Exception handling
- Database schema design
- Console input handling

## 👩‍💻 Author

Dipti Shinde

## 🎯 Learning Outcome

This project helped me understand how Java applications connect to relational databases and how to manage persistent data using JDBC, MySQL, and SQL queries.

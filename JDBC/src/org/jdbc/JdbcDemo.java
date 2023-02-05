package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/hi";
		String username = "root";
		String password = "Appstore123@";
		String query = "select*from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");                          		// Login and Register
		Connection connect = DriverManager.getConnection(url, username, password);  // Create Connection
		Statement state = connect.createStatement();  								// Create Statement
		ResultSet result = state.executeQuery(query); 								// Execute Query 

		while (result.next()) {
			String name = result.getString("Salary");
			System.out.println(name);
		}
		result.close(); 															// Result and Close

	}
}


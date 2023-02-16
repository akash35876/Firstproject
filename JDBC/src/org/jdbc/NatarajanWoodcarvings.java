package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NatarajanWoodcarvings {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url= "jdbc:mysql://localhost:3306/hi";
		
		String username = "root";
		
		String password = "Appstore123@";
		
		String query = "select*from employee";
		 
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		
		Connection connect = DriverManager.getConnection(url,username,password);
		
		Statement state  = connect.createStatement();
		
		ResultSet result = state.executeQuery(query);
		
		
		while(result.next()) {
			
			String name = result.getString("ename");
			
			System.out.println(name);
		}
		
		result.close();
		System.out.println("Hello World");
	}

}

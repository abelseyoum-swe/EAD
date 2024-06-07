package com.itsc;

import java.sql.*;

public class QueryData {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "MySQL.P@5s_001!";
		String databaseName = "StudentsDB";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		
		String query = "SELECT * FROM " + databaseName;
		ResultSet result = statement.executeQuery(query);
		
		while(result.next()) {
			int id = result.getInt("id");
			String fname = result.getString("first_name");
			String lname = result.getString("last_name");
			String school = result.getString("school");
			System.out.println(id);
			
		}
		
	}

}

package com.itsc;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "MySQL.P@5s_001!";
		String databaseName = "StudentsDB";
		String tableName = "Grade";
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful!");
			statement = connection.createStatement();
			
			String database = "USE " + databaseName;
			String[] datas = {"INSERT INTO " + tableName + " (first_name, last_name, school) VALUE ('Abdulfeta', 'Sani', 'Addis Ababa University');", 
					"INSERT INTO " + tableName + " (first_name, last_name, school) VALUE ('Abdulfeta', 'Sani', 'Addis Ababa University');", 
					"INSERT INTO " + tableName + " (first_name, last_name, school) VALUE ('Abdulfeta', 'Sani', 'Addis Ababa University');", 
					"INSERT INTO " + tableName + " (first_name, last_name, school) VALUE ('Abdulfeta', 'Sani', 'Addis Ababa University');"};
			
			statement.executeUpdate(database);
			
			for (String data: datas) {
				statement.executeUpdate(data);
			}
			
			System.out.println("Data inserted successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Connection closed successfully!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

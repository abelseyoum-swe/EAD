package com.itsc;

import java.sql.*;

public class CreateDatabase {

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
			
			String createDatabase = "CREATE DATABASE " + databaseName;
			String database = "USE " + databaseName;
			String createTable = "CREATE TABLE " + tableName + " (id int auto_increment primary key, first_name varchar(255), last_name varchar(255), school varchar(255));";
			statement.executeUpdate(createDatabase);
			statement.executeUpdate(database);
			statement.executeUpdate(createTable);
			System.out.println("Database created successfully!");

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

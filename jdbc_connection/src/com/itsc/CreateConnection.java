package com.itsc;

import java.sql.*;

public class CreateConnection {

	public static void main(String[] args) {
		
		
		
		String url = "jdbc:mysql://localhost:3306/StudentsDB";
		String username = "root";
		String password = "MySQL.P@5s_001!";
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to the database successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Connection closed successflly!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
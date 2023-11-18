package com.simpli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/railcross";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Pass@06";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

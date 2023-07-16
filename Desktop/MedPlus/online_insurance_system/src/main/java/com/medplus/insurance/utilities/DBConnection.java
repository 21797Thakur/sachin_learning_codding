package com.medplus.insurance.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DBConnection {
	private static Connection conn;
	public static Connection open() {
		String url = "jdbc:mysql://localhost:3306/insurance_project";
		try {
			DriverManager.registerDriver(new Driver());
			conn = DriverManager.getConnection(url, "root", "9Sachin@@");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

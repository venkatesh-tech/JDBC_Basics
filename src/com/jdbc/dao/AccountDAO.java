package com.jdbc.dao;

import java.sql.*;

public class AccountDAO {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Venky1234@");
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}

package com.jdbc.dao;

import java.sql.*;

public class AccountDAO {

	public static void main(String[] args) {

		try {
			DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Venky1234@");
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}

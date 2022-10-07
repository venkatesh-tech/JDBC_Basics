package com.jdbc.dao;

import java.sql.*;

public class AccountDAO {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Venky1234@");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into account values(1,'Kolapalli','Venkatesh',10000)");
			System.out.println(result + " rows got inserted");
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}

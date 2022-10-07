package com.jdbc.dao;

import java.sql.*;

public class AccountDAO {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Venky1234@");
			System.out.println(connection);
			Statement statement = connection.createStatement();

			// Insert
//			int result = statement.executeUpdate("insert into account values(1,'Kolapalli','Venkatesh',10000)");
//			System.out.println(result + " rows got inserted");

			// Update
//			int result = statement.executeUpdate("update account set bal=5000 where accno=1");
//			System.out.println(result + " rows got Updated");

			// Delete
			int result = statement.executeUpdate("delete from account where accno=1");
			System.out.println(result + " rows got deleted");

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}

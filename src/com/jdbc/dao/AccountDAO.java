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
//			int result = statement.executeUpdate("delete from account where accno=1");
//			System.out.println(result + " rows got deleted");

			// Select
			ResultSet rs = statement.executeQuery("select * from account");
			while (rs.next()) { // column numbers are accno->1, lastname->2,FirstName->3,bal->4
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}

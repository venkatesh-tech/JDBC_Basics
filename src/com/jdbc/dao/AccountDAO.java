package com.jdbc.dao;

import java.sql.*;

public class AccountDAO {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Venky1234@");
				Statement statement = connection.createStatement(); // close methods are called automatically for them.
				ResultSet rs = statement.executeQuery("select * from account");) {

			System.out.println(connection);

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

			while (rs.next()) { // column numbers are accno->1, lastname->2,FirstName->3,bal->4
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		// Another method to close them is to have a finally block and close them. like
		// connection.close
	}
}

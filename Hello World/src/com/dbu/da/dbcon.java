package com.dbu.da;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class dbcon {
 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://locahost;user=local;password=Welcome@123;database=MyFirstDB");
		System.out.println("test");
		Statement sta = conn.createStatement();
		String Sql = "select * from employee";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}
}
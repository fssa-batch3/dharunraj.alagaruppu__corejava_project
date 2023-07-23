package day11.solved;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;


public class TestMysqlConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String password = "root";

		Connection conn = DriverManager.getConnection(url, userName, password);
		System.out.println("Done");
		
		Statement st = conn.createStatement(); 

	}
}

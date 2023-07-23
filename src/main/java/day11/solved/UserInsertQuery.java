package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserInsertQuery {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String password = "root";

		// Get connection
		Connection conn = DriverManager.getConnection(url, userName, password);

		// Create a Statement
		Statement stmt = conn.createStatement();

		// Execute Insert Query
		String query = "INSERT INTO users (first_name, last_name, email_id, password, github_username) VALUES (\"Dharunraj\", \"A\",\"dhar@gmail.com\", \"740247dha@\", \"dharun-09\")";
		int rows = stmt.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		// close the connection resources
//        rs.close();
		stmt.close();
		conn.close();

	}

}
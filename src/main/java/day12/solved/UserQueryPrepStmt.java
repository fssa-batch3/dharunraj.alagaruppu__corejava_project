package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;

public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String query = "INSERT INTO USERS (user_name, email_id,  password) VALUES ( ?, ?, ? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "dharunraj");
		pst.setString(2, "dharunraj.alagaruppu@fssa.freshworks.com");
		pst.setString(3, "password007");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2);
		pst.close();

	}

}

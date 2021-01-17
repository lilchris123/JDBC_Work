package com.collabera.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatements {
	public static void preparedStatements() throws SQLException {
		Connection conn=ConnectionManager.getConnection();
		PreparedStatement pstmt= conn.prepareStatement(" select * from sakila.actor where first_name = ?");
		pstmt.setString(1, "sissy");
		
		ResultSet rs= pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("first_name"));
		}
	}
}

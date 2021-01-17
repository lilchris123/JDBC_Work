package com.collabera.jdbc;

import java.sql.*;

public class queryFunctions {
	
	public static void runModifyQuery(String query) throws SQLException {
		Connection conn= ConnectionManager.getConnection();
		
		Statement stm= conn.createStatement();
			stm.executeUpdate(query);
			System.out.println("Modified database");
			stm.close();
			conn.close();
		
	}
	
	public static void runSelectQuery(String query) throws SQLException {
			
			Connection conn= ConnectionManager.getConnection();
		
			Statement stm= conn.createStatement();
			//conn.close();
			ResultSet result= stm.executeQuery(query);
			ResultSetMetaData rmeta= result.getMetaData();

			int columns= rmeta.getColumnCount();
			
			for(int i=1; i<=columns; i++) {
				System.out.print(rmeta.getColumnName(i) + "       		");
			}
			System.out.println();
			
			while(result.next()) {
				for(int i=1; i<=columns; i++) {
					System.out.print(result.getString(i) + "       		");
				}
				System.out.println();
			}
			
			stm.close();
		
		//close the connection
			conn.close();
	}

}

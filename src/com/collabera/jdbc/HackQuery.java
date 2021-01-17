package com.collabera.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HackQuery {
	public static void hackQuery() throws SQLException {
		Connection conn = ConnectionManager.getConnection();
		Statement state=conn.createStatement();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Type name of the city you're looking for: ");
		
		String name = sc.nextLine();
		
		//String query= String.format("select * from city where name = '%s'", name);
		
		String query= String.format("select * from city where name = 'x' or 'a'='a' ", name);
		
		System.out.println(query);
		
	}
}

package com.collabera.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {
	public static void statementex() throws SQLException {
		Connection conn= ConnectionManager.getConnection();
		
		Statement statement= conn.createStatement();
			boolean flag=statement.execute("");
			int count = statement.executeUpdate("Insert into Jump_people(firstName,lastName) values ('#######', '########')");
            System.out.println("Row Inserted and now the count is  " + count);
            
            //-----Update
            count = statement.executeUpdate("Update Jump_people set firstName = '######' where firstName = '######'");
            System.out.println("Row Updated and now the count is  " + count);
            
            //-----delete
            count = statement.executeUpdate("Delete from Jump_people where firstName = '#######'");
            System.out.println("Row deleted and now the count is  " + count);
    
		
	}
}

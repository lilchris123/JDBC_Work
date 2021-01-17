package com.collabera.jdbc;

import java.sql.*;

public class ConnectionManager {
	
	static final String URL= "jdbc:mysql:/sakila?serverTimezone=EST5EDT";
	static final String USERNAME= "testUser";
	static final String PASSWORD= "123";
	
	public static Connection getConnection() {
		Connection conn= null;
	
		try {
		conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
		System.out.println("Connection was made!\n");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void setNum(Integer n) {
	
	}
	public static void main(String[] args) {
		
//		String createTableQuery ="create table newTable"
//				+ "(id int auto_increment primary key,"
//				+ "name varchar(60) not null,"
//				+ "age int not null)";
		
		String showActorQuery= "select * from actor";
		
		try {
		queryFunctions.runSelectQuery(showActorQuery);
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
	
	}

}

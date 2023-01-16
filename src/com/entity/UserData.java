package com.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.database.connection.ConnectionDb;


public class UserData {
public void userDataBase (String userName, String userEmailId, float userPhone , String userAddress, String userPassword) throws SQLException { //InsertUser changed 
		
		//boolean f = false;
		
		Connection connection = null;
		PreparedStatement ps = null;

		try{
			
			// insert into DB
			// Create Connection
			ConnectionDb connectionDb = new ConnectionDb();
			connection = connectionDb.getConnectionDb();
			// SQL Query
			// set values of parameter
			ps = connection.prepareStatement("insert into user(userName,userEmailId,userPhone,userAddress,userPassword)values(?,?,?,?,?)");
			
			ps.setString(1, userName);
			ps.setString(2, userEmailId);
			ps.setFloat(3, userPhone);
			ps.setString(4, userAddress);
			ps.setString(5, userPassword);
			
			int i = ps.executeUpdate();
			System.out.println("Record insert>>" +i);
		

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			ps.close();
		}	
	}
   
  }    

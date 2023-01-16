package com.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.database.connection.ConnectionDb;

public class Category {
	
	Scanner sc = new Scanner(System.in);
	
	public void categoryData(int categoryId,String categoryTitle) throws SQLException  {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			ConnectionDb connectionDb = new ConnectionDb();
			connection = connectionDb.getConnectionDb();
			ps = connection.prepareStatement("insert into category(categoryId,categoryTitle,categoryDescription)values(?,?,?)");
			ps.setInt(1, categoryId);
			ps.setString(2, categoryTitle);
			
			int i = ps.executeUpdate();
			System.out.println("Record insert>> " +i);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void insertNumberOfCategory() throws SQLException {
		for(int i=1; i<=5; i++) {
			System.out.println("Enter category Id:");
			int categoryId=sc.nextInt();
			System.out.println("Enter category Title:");
			String categoryTitle=sc.next();
			
			Category category = new Category();
			category.categoryData(categoryId,categoryTitle);
		}
	 }	
}

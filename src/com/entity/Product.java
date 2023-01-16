package com.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.database.connection.ConnectionDb;


public class Product {
	Scanner sc = new Scanner(System.in);
	
	public void insertProduct(int productId,String productDescription,int productPrice,int productQuantity) throws SQLException  {
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			ConnectionDb connectionDb = new ConnectionDb();
			connection = connectionDb.getConnectionDb();
			ps = connection.prepareStatement("insert into product(productId,productDescription,productPrice,productQuantity)values(?,?,?,?)");
			ps.setInt(1, productId);
			ps.setString(2, productDescription);
			ps.setInt(3, productPrice);
			ps.setInt(4, productQuantity);
			
			int i = ps.executeUpdate();
			System.out.println("Record insert>>" +i);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			ps.close();
		}
	
	}
	public void insertNumberOfProduct() throws SQLException {
	for(int i=1; i<=10; i++) {
		System.out.println("Enter product Id:");
		int productId=sc.nextInt();
		System.out.println("Enter product Description:");
		String productDescription=sc.next();
		System.out.println("Enter product Price:");
		int productPrice=sc.nextInt();
		System.out.println("Enter product Quantity:");
		int productQuantity=sc.nextInt();	
		
		Product product = new Product();
		product.insertProduct(productId,productDescription,productPrice,productQuantity);
	}
 }	
		
	
	/*public void getQuantity() throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.println("Check Product Quantity..");
		scan.next();
		System.out.println("Enter Product ID : ");
		scan.next();
		//String ID = scan.next();
				
	}*/

}

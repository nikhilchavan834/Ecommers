package com.cart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.database.connection.ConnectionDb;


public class Cart {
public void addToCart() throws IOException, SQLException {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select category : ");
		
		System.out.println("Add Products To cart : ");
		System.out.println("Enter Product ID : ");
		String ID = scanner.next();
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
		    ConnectionDb connectionDb = new ConnectionDb();
		    connection = connectionDb.getConnectionDb();
		
		     // create query
			String s = "select ProductId,ProductName,ProductPrice from product where ProductId=?";
			// prepared statement
		    PreparedStatement preparedStatement = connection.prepareStatement(s);
			preparedStatement.setString(1, ID);
			ResultSet r = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = (ResultSetMetaData) r.getMetaData();
			int col = rsmd.getColumnCount();
		
		  ArrayList<String> cart = new ArrayList<>();
		   {
			while (r.next()) {

				System.out.println("Products in Cart..");
				cart.add("ID : "+r.getString(1));
				cart.add("Name : "+r.getString(2));
				cart.add("Price : "+r.getString(3));
				System.out.println(cart);
				System.out.println("Total Amount : "+cart.get(2));
				/*
				 * System.out.println("Products in Cart....");
				 * System.out.println("--------------------");
				 * System.out.println("ID : "+r.getString(1));
				 * System.out.println("Product Name : "+r.getString(2));
				 * System.out.println("Price:"+r.getString(3)); System.out.println("");
				 */
			  }
			
			}
		}catch(Exception e) {
		    e.printStackTrace();		
    		
        }
    }   
}





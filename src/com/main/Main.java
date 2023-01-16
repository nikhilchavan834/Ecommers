package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import com.admin.AdminLogin;
import com.entity.Category;
import com.entity.Product;
import com.entity.UserData;
import com.userLogin.Login;
//import com.userLogin.UserInterface;
import com.userLogin.UserRegistration;

public class Main {
	public static void main(String[] args) throws  ClassNotFoundException, SQLException, Exception, IOException {
		
		
		Scanner sc = new Scanner(System.in);
	     
		System.out.println("Welcome To E-Store..");
		
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("-------------------------");
			System.out.println("Press 1 to Register : ");
			System.out.println("Press 2 to Login : ");
			System.out.println("Press 3 to Login as Admin : ");
			System.out.println("Press 4 to Exit : ");
			System.out.println("-------------------------");
			int a = Integer.parseInt(bufferedReader.readLine());
			
			if(a == 1) {
				System.out.println("---------------------");
				System.out.println("Welcome to Registration Page....");
				UserRegistration userRegistration = new UserRegistration(); 
				userRegistration.userRegistration();
				System.out.println("---------------------");
				System.out.println("---------------------");
				System.out.println("Welcome to Login Page");
				Login login = new Login(); 
				login.userLogin();
				System.out.println("---------------------");
			 }
			if(a == 2) {
				System.out.println("---------------------");
				System.out.println("Welcome to Login Page");
				Login login = new Login(); 
				login.userLogin();
				System.out.println("---------------------");
				System.out.println("---------------------");
				System.out.println("Select category : ");
				Category category = new Category();
				category.categoryData(a, null);
			 }
			if(a == 3) {
				AdminLogin adminLogin = new AdminLogin();
				System.out.println("---------------------");
				System.out.println("Welcome to Admin Page");
				System.out.println("Press 1 for Registration of new Admin: ");
				System.out.println("Press 2 to Login into admin page : ");
				int b = Integer.parseInt(bufferedReader.readLine());
				System.out.println("---------------------");
				
				if(b == 1) {
					System.out.println("---------------------");
					System.out.println("Welcome to Admin Registration Page");
					adminLogin.adninRegistration();
				
				    adminLogin.adminLogin();
				
			    	//BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
				 while (true) {
					System.out.println("-------------------------");
					System.out.println("Press 1 for Update Product Table : ");
					System.out.println("Press 2 to Update Category Table : ");
					System.out.println("Press 3 to View Checkout entry : ");
					System.out.println("-------------------------");
					//int j = Integer.parseInt(bufferedReader.readLine());
				
					if(b == 2) {
						adminLogin.adminLogin();
						Product product = new Product();
						product.insertNumberOfProduct();
						}
					}
			    }
		    }
	    }
	}
}
		
		
		
		
		
		
		
		//System.out.println("Thank You For Visiting Us....");
		
		 
		

	
	


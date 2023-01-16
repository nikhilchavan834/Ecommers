package com.admin;

import java.util.Scanner;

public class AdminLogin {
	Scanner sc = new Scanner(System.in);
	public void adninRegistration() {
		
		Admin admin = new Admin();
		
		 System.out.print(" Enter userName => ");
	     String adminname = sc.nextLine();
	     admin.setAdminName(adminname);
	     
	     System.out.print(" Enter userEmailId => ");
	     String adminemailId = sc.nextLine();
	     admin.setAdminemailId(adminemailId);

	     System.out.print(" Enter userPassword => ");
	     String password = sc.nextLine();
	     admin.setAdminPassword(password);
	} 
	
	     public void adminLogin() {
	    	 System.out.println("Welcome to Admin logging page ");
		
		try  {
			System.out.println("---------------------");
	        System.out.print(" Enter user name => ");
	        String adminname = sc.nextLine();

	        System.out.print(" Enter password => ");
	        String Password = sc.nextLine();

	        if ("adminame".equals(adminname) && "password".equals(Password)) {
	            System.out.println(" User successfully logged-in.. ");
	        } else {
	            System.out.println(" In valid userName of password ");
	        }
	    }finally {
	    	
	    }
	 } 	

}

package com.userLogin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cart.Cart;
import com.database.connection.ConnectionDb;
import com.entity.Product;

public class UserInterface {

	public void Ui() throws SQLException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		try(Scanner scanner = new Scanner(System.in)) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// create connection
		ConnectionDb connectionDb = new ConnectionDb();
		connection  = connectionDb.getConnectionDb();
		// SQL Query
		//String s = "select * from user where UserName=? and Password=? ";
		// Execute Query using Prepared Statement
		
		
		System.out.println("The records selected are:");
        int rowCount = 0;
		// rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
        // It returns false if no more rows.
        ResultSet rset = null;
		while(rset.next()) {   // Repeatedly process each row
           String title = rset.getString("title");  // retrieve a 'String'-cell in the row
           double price = rset.getDouble("price");  // retrieve a 'double'-cell in the row
           int    qty   = rset.getInt("qty");       // retrieve a 'int'-cell in the row
           System.out.println(title + ", " + price + ", " + qty);
           ++rowCount;
		  }
		
		BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("-------------------------");
			System.out.println("Press 1 to Register : ");
			System.out.println("Press 2 to Login : ");
			System.out.println("Press 3 to Login as Admin : ");
			System.out.println("Press 4 to Exit : ");
			System.out.println("-------------------------");
			int a = Integer.parseInt(bufferedReader1.readLine());

			if (a == 1) {
				// add user
				System.out.println("Registration Page....");
				System.out.println("Enter Name : ");
				String name = bufferedReader1.readLine();
				System.out.println("Enter UserName : ");
				String username = bufferedReader1.readLine();
				System.out.println("Enter Password : ");
				String pass = bufferedReader1.readLine();

				// Create RegisterUSer object to store the object
				/*RegisterUser registerUser = new RegisterUser(name,username, pass);
				boolean ans = InsertUser.Insertuser(registerUser);
				if (ans) {
					System.out.println("User Registered Successfully....");

				} else {
					System.out.println("Something Went Wrong.... ");
				}*/

			}
			if (a == 2) {
				// Login Page
				System.out.println("Login Page");
				System.out.println("---------------------");
				System.out.println("Enter Username : ");
				String Uname = bufferedReader1.readLine();
				System.out.println("Enter Password : ");
				String Password = bufferedReader1.readLine();
				// Calling Login Class method to Validate username and password
				//Login login = new Login();
				//login.validateLogin(Uname, Password);

			}
			if (a == 3) {
				//Admin Login Page
				System.out.println("Admin Login..");
				System.out.println("-------------------------");
				System.out.println("Enter Username : ");
				String uid = bufferedReader1.readLine();
				System.out.println("Enter Password : ");
				String pas = bufferedReader1.readLine();
				if(uid.equals("Admin") && pas.equals("Admin")) {
					System.out.println("Login Successfull...");
					System.out.println("Welcome Admin!!");
				}
				else {
					System.out.println("Invalid Username or Password..");
					break;
				}
				//Admin admin = new Admin();
				//admin.adminMenu();
			}
			if (a == 4) {
				
				// exit
				break;
			} 
			else {
				
			}

		}
		
		 System.out.print(" Enter user name => ");
         String userName = scanner.nextLine();

         System.out.print(" Enter password => ");
         String password = scanner.nextLine();

         if ("ramesh".equals(userName) && "password".equals(password)) {
             System.out.println(" User successfully logged-in.. ");
         } else {
             System.out.println(" In valid userName of password ");
         }
		

		// Get Data into Result Set
		ResultSet r = ps.executeQuery();
		if (r.next()) {
			System.out.println("Login Successfull..");
			System.out.println("---------------------");

			while (true) {
				System.out.println("Press 1 to Product Display: ");
				System.out.println("Press 2 to Add To Cart : ");
				System.out.println("Press 3 to Checkout : ");
				System.out.println("Press 4 to Logout : ");
				System.out.println("-----------------------------");

				int b = Integer.parseInt(bufferedReader1.readLine());

				if (b == 1) {
					// Show Product Info
					Product product = new Product();
					product.insertProduct(0, null, 0, 0);

				}
				if (b == 2) {
					// Add Product To Cart
					Cart cart = new Cart();
					cart.addToCart();

				}
				/*if (b == 3) {
					// Checkout And Bill Amount Calculation
					CheckOut checkOut = new CheckOut();
					checkOut.CheckOutDetails();
					System.out.println("Thank You For Shopping With Us....");
					System.out.println("-----------------------");
					
				}*/
				if(b==3) {
					//Logout
					System.out.println("Logged Out Successfully..");
					break;
					
				}
			 }
		   }else {
			    System.out.println("-----------------------------");
			    System.out.println("Invalid Username or Password!!");

		 }
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		

			

	}

}

package com.userLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.database.connection.ConnectionDb;
import com.entity.User;

public class UserRegistration {
	
	public void userRegistration() {
    	
        Scanner sc = new Scanner(System.in);
        User user = new User();

//Connection connection = null;
//PreparedStatement ps = null;
   
	 try {
	   /* ConnectionDb connectionDb = new ConnectionDb();
		connection = connectionDb.getConnectionDb();
		
		ps = connection.prepareStatement("insert into product(userName,userEmailId,userPhone,userAddress,userPassword)values(?,?,?,?,?)");
		ps.setString(1, userName);
		ps.setString(2, userEmailId);
		ps.setFloat(3, userPhone);
		ps.setString(4, userAddress);
		ps.setString(5, userPassword);
		
		int i = ps.executeUpdate();
		System.out.println("Record insert>>" +i);*/
		 
     System.out.print(" Enter userName => ");
     String username = sc.nextLine();
     user.setUserName(username);

     System.out.print(" Enter userEmailId => ");
     String userEmailId = sc.nextLine();
     user.setEmailId(userEmailId);

     System.out.print(" Enter Phone No. => ");
     float userPhone = sc.nextFloat();
     user.setUserPhone(userPhone);

     System.out.print(" Enter Address => ");
     String userAddress = sc.nextLine();
     user.setUserAddress(userAddress);

     System.out.print(" Enter password => ");
     String userpassword = sc.nextLine();
     user.setPassword(userpassword);

     System.out.println(user.toString());

	 }catch(Exception e) {
		 
	 }
	 
} 

}	
	/*System.out.println("Enter userName: ");
	String userName = sc.next();
	System.out.println("Enter userPhone: ");
	float userPhone = sc.nextFloat();
	System.out.println("Enter userAddress: ");
	String userAddress = sc.next()*/

 

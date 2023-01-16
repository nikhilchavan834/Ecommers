package com.userLogin;

import java.util.Scanner;

public class Login {
	public void userLogin() {
	
	try (Scanner sc = new Scanner(System.in)) {
        System.out.print(" Enter user name => ");
        String username = sc.nextLine();

        System.out.print(" Enter password => ");
        String userpassword = sc.nextLine();

        if ("userName".equals(username) && "password".equals(userpassword)) {
            System.out.println(" User successfully logged-in.. ");
        } else {
            System.out.println(" In valid userName of password ");
        }
    }
  }	

}

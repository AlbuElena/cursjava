package curs3;

import java.util.Scanner;

public class Login {
	
	public void verificaLogin() {
		
		Scanner scan = new Scanner(System.in);
		String username = "test";
		String password = "test123";
		
		System.out.println("Te rog sa introduci username: ");
		String user = scan.next();
		System.out.println("Te rog sa introduci parola: ");
		String pass = scan.next();
		// && -- AND
		// || -- OR
		
		if (user.equals(username)  && pass.equals(password)) {
				
		System.out.println("Login sucessfull");
	}	else {
		System.out.println("Login failed!");
		}
}
}
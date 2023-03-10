package curs6;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		//simulare login
		String user = "TestUser";
		String password = "1234";
		int i = 1;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a user: ");
			String scanuser = scan.next();
			System.out.print("Enter a password: ");
			String scanpassword = scan.next();
			
			if(scanuser.equals(user)) {
				if(scanpassword.equals(password)) {
					System.out.println("Login Successful"); break;
				}else {
					System.out.println("Login Error");
				}	
			} else {
				System.out.println("Login Error");
			}
			i++;
		}while (i<=3);
		
		if(i==4) {
			System.out.println("Maximum attempts reached. User blocked");
		}
	}

}


package curs4;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// afiseaza suma a 10 numere introduse	
		
		int S=0;
				
		for(int i=1; i<11; i++) {
			System.out.println("Please enter number " + i + ":");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			S=S+a;
		}
		
		System.out.println("The sum of the numbers is: " + S);
	}
	
}
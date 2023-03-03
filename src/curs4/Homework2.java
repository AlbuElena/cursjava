package curs4;

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {
		//afiseaza tabla inmultirii numarului introdus
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
			
		for(int i=1; i<=10; i++) {
			System.out.println(a + "*" + i + "=" + a*i);
		}
		
	}
	
}
package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		// program care calculeaza salariul pe o saptamana (ratePerHour + hoursWorked
		// intrebam userul cate ore a lucrat
		//calculam doar daca nrul de ore este intre 1 si 40
		//daca numarul de ore este invalid il rugam sa mai introduca o data 
		
		int ratePerHour = 15 ;
		System.out.println("Cate ore ai lucrat saptaman aceasta: ");
		Scanner scan = new Scanner (System.in);
		int hoursWorked = scan.nextInt();
		while(hoursWorked < 1 || hoursWorked >40) {
			System.out.println("Nr invalid de ore");
			System.out.println("Te rog introdu un nr intre 1 si 40");
			hoursWorked = scan.nextInt();
			
		}
		System.out.println("Salariul de platit este: " + hoursWorked*ratePerHour);
	}

}

package curs3;

import java.util.Scanner;

public class Print_anumit_char_din_string {

	public static void main(String[] args) {
	/*	// Afisez un string introdus de la tastatura 
	 	 
		String A;
		System.out.println("Introdu A= ");
		Scanner scan = new Scanner(System.in);
		A = scan.next();
		System.out.println("A= " + A);
	*/
			
		// afisez caracterul de pe o anumita pozitie din sir
		String A;
		int p;
	
		System.out.println("Introdu stringul: ");
		Scanner sir = new Scanner (System.in);
		A = sir.next();
		
		System.out.println("Vom afisa caracterul de pe pozitia: ");
		Scanner pozitia = new Scanner(System.in);
		p = pozitia.nextInt() - 1;
		if(p < A.length() ) {			
		
		System.out.println("Rezultatul este: " + A.charAt(p));
	
	    }else System.out.println("Sirul are lungimea maxima "+A.length());

	}
		
}


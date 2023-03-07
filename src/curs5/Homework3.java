package curs5;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// palindrom
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti un cuvant:");
		String cuvant = scan.next();
		boolean palindrom = true ;
				
		for(int i=0; i<cuvant.length()/2; i++) {
				if(cuvant.charAt(i)!= cuvant.charAt(cuvant.length()-1-i)) {
					palindrom = false;
				}			
		}
		
		if(palindrom) {  
			System.out.println("Este palindrom");
		}else System.out.println("Nu este palindrom");
	}
}

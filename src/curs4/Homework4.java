package curs4;

import java.util.Scanner;

public class Homework4 {
	
	static String ziuaSaptamanii;
	
	public static void Printare() {
		System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
	}
	
	public static void main(String[] args) {
		// afiseaza ziua saptamanii corespunzatoare numarului introdus
		
		System.out.println("Introdu un numar:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
				
		switch (a) {
		case 1: 
			ziuaSaptamanii = "Luni";
			Printare();
			break;
		case 2 : 
			ziuaSaptamanii = "Marti";
			Printare();
			break;
		case 3 : 
			ziuaSaptamanii = "Miercuri";
			Printare();
			break;
		case 4 : 
			ziuaSaptamanii = "Joi";
			Printare(); 
			break;
		case 5 : 
			ziuaSaptamanii = "Vineri";
			Printare();
			break;
		case 6 : 
			ziuaSaptamanii = "Sambata";
			Printare();
			break;
		case 7 : 
			ziuaSaptamanii = "Duminica";
			Printare();
			break;
		default: System.out.println("Te rugam sa introduci un numar intre 1 si 7");
		
		}
	/*if(a<=7&&a>0) {
		System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
	}else System.out.println("Te rugam sa introduci un numar intre 1 si 7");*/
	}

}

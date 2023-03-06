package curs4;

import java.util.Scanner;

public class Homework4 {
	

	public static void main(String[] args) {
		// afiseaza ziua saptamanii corespunzatoare numarului introdus
		
		System.out.println("Introdu un numar:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String ziuaSaptamanii = null;
		
		switch (a) {
		case 1: 
			ziuaSaptamanii = "Luni";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		case 2 : 
			ziuaSaptamanii = "Marti";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		case 3 : 
			ziuaSaptamanii = "Miercuri";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		case 4 : 
			ziuaSaptamanii = "Joi";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		case 5 : 
			ziuaSaptamanii = "Vineri";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		case 6 : 
			ziuaSaptamanii = "Sambata";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		case 7 : 
			ziuaSaptamanii = "Duminica";
			//System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
			break;
		//default: System.out.println("Te rugam sa introduci un numar intre 1 si 7");
		
		}
	if(a<=7) {
		System.out.println("Ziua saptamanii este " + ziuaSaptamanii); 
	}else System.out.println("Te rugam sa introduci un numar intre 1 si 7");
	}

}

package curs7;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// printeaza numele lunii bazandu-se pe numarul introdus
		
		int numar;
		String[] lunile = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
		System.out.println("Introduceti un numar: ");
		Scanner scan = new Scanner(System.in);
		numar =scan.nextInt();
		
		while (numar<0 || numar>11) {
				System.out.println("Ati introdus un numar invalid. Introduceti un numar intreg intre 0 si 11!");
				System.out.println("Introduceti un numar: ");
				numar =scan.nextInt();
			}
		System.out.println(lunile[numar]);
		
		

	}

}

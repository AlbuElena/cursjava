package curs5;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// printeza inversului numarului introdus de la tastatura
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		String numar = scan.next();
		int lungime = numar.length();
		while(lungime>0) {
			System.out.print(numar.charAt(lungime-1));
			lungime -=1;
		}

	}

}

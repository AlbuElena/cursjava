package curs5;

import java.util.Scanner;

public class ForvsWhile {

	// un program care ii cere userului numere pe care le aduna, fara limita
	//cand userul vrea sa iasa din program introduce 0
	
	public static void main(String[] args) {
		//rezolvareCuFor();
		rezolvareCuWhile();

	}

	public static void rezolvareCuFor() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner (System.in);
		int suma = 0;
		for (int numar = scan.nextInt(); numar !=0; numar = scan.nextInt()) {
			suma = suma + numar ;
			System.out.println("Please enter a number: ");
		}
		System.out.println("Suma totala:" + suma);
	}
	
	public static void rezolvareCuWhile() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner (System.in);
		int suma = 0;
		int numar = scan.nextInt();
		while(numar != 0) {
			suma = suma + numar ;
			System.out.println("Please enter a number: ");
			numar= scan.nextInt();
		}
		System.out.println("Suma totala:" + suma);
	}
}


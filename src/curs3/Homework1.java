package curs3;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		System.out.println("Te rog introdu un punctaj mai mare sau egal cu 0: ");
		Scanner scan = new Scanner(System.in);
		
		int punctaj = scan.nextInt();
		
		if(punctaj>=0 && punctaj <=65) {
			System.out.println("Ai picat. Mai incearca");
		}else System.out.println("Felicitari. Ai trecut!");
					    
	}
	
}

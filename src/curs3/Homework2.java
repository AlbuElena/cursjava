package curs3;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		System.out.println("Te rog introdu varsta:");
		Scanner scan = new Scanner(System.in);
		
		int varsta = scan.nextInt();
		
		if (varsta < 18) {
			System.out.println("Esti minor");
		} else if (varsta < 65) {
			System.out.println("Esti adult");
		} else System.out.println("Esti batran");
		
		

	}

}

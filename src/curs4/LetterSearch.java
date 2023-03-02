package curs4;

import java.util.Scanner;

public class LetterSearch {
 // citim un string de la tastatura, cautam daca contine litera A si daca o gasim printam ca litera A exista in text
	//daca nu o gasim printam ca litera nu exista in text
	//si printam si de cate ori exista daca o gasim
	
	public static void main(String[] args) {
		System.out.println("Please enter a text:");
		Scanner scan = new Scanner(System.in)	;
		String text = scan.next().toUpperCase();
		int counter = 0;
		
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i) == 'A') { counter++;}
		}
if(counter >0) {
	System.out.println("Litera A exista in text de " + counter);
				} else System.out.println("Nu s-a gasit litera A");
	}
}
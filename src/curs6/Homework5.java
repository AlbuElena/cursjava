package curs6;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// evaluare punctaj
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti punctajul: ");
		int punctaj = scan.nextInt();
		String result = punctaj >=90 ? "FB" : punctaj >= 80 ? "B" :"S";
			
		/*switch(result) {
		case "FB": System.out.println("Ai primit : FoarteBine"); break;
		case "B": System.out.println("Ai primit : Bine"); break;
		case "S": System.out.println("Ai primit : Suficient"); break;
		
		
		}*/
		String greeting = (result.equals("FB"))? "Ai primit : FoarteBine" :(result.equals("B"))?"Ai primit : Bine":"Ai primit : Suficient";

        System.out.println(greeting);
	}

}

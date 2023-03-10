package curs6;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// discountul unei facturi
		
		float factura;
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti factura:");
		factura = scan.nextFloat();
		
		float facturaCudiscount = factura>100 ? factura*90/100 : factura < 100 ? factura*95/100 : factura;
		System.out.println(facturaCudiscount);

	}

}

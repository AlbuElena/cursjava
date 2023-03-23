package curs8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// catalog
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Alex",	7);
		map.put("Cornel", 4);
		map.put("Daria", 9);
		
		System.out.println("Introdu numele tau:");
		Scanner scan = new Scanner(System.in);
		String nume = scan.next();
		System.out.println("Introdu nota:");
		//Scanner scan2 = new Scanner(System.in); // nu e nevoie de 2 instante a clasei Scanner
		int nota = scan.nextInt();
		
		if(map.containsKey(nume) == true) {
			
			if((map.get(nume)) >= nota) {
				System.out.println("Nu ai nevoie de alta nota");
			}else if ((map.get(nume)) < nota) {
				map.replace(nume, nota);
			}
			
		}else {
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			map.put(nume, nota);
		}
		
		System.out.println(map);

	}

}

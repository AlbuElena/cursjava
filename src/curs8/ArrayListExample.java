package curs8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		//String[] array = new String[3];
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Ioana");
		list.add("Ion");
		list.add("Maria");
		
		
		System.out.println(list.get(2));
		System.out.println("-----------------");
		list.add(1, "George");
		
		for(String nume: list) {
			System.out.println(nume);			
		}
		
		list.remove(0); // sau list.remove("Iona");
		System.out.println("-----------------");
		for(String nume: list) {
			System.out.println(nume);			
		}
		
		String text = "Maria";
		System.out.println(list.contains(text));
		
		list.set(0, "Oana"); //update pe elem de pe pozitia 0
		System.out.println("-----------------");
		for(String nume: list) {
			System.out.println(nume);			
		}
		
		list.add("Ioana");
		list.add("Marian");
		
		System.out.println("---------Before--------");
		for(String nume: list) {
			System.out.println(nume);			
		}
		list.subList(2, 4).clear(); //se sterge de la indexul 2 inclusiv, dar pana la index 4 exclus
		System.out.println("---------After--------");
		for(String nume: list) {
			System.out.println(nume);			
		}
		

	}

}

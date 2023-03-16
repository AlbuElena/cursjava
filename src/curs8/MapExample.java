package curs8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		/*{produs:
		 * 		pret: 4
		 * 		descriere : coconut
		 * 		stock : true
		 * } 
		 * asta ar fi fisier extern: json
		 */
		
		Map<String, String> map = new HashMap<>();
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PM", "ProductManager");
		
		for(String key : map.keySet()) {
			System.out.println(key);			
		}
		
		for(String value : map.values()) {
			System.out.println(value);			
		}
		
		System.out.println(map);
		
		System.out.println(map.get("T"));
		
		System.out.println(map.get("Tester")); // cauta Tester in chei, nu in valori, parame trul trebuie sa fie musai cheie
		
		System.out.println(map.containsValue("Support"));
		System.out.println(map.containsKey("D"));
		
	
		

	}

}

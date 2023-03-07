package curs5;

public class Homework2CuFor {

	public static void main(String[] args) {
		// numara vocalele dintr-un string dat
		
		String text = "Eu invat Java";
		String uppertext = text.toUpperCase();  // transform in Upper sirul initial, ca sa caut atat vocalele a, e, i, o, u cat si A, E, I, O, U
		int count = 0;
						
		for(int i=0; i< text.length(); i++ ) {
					
			switch(uppertext.charAt(i)) {
			
			case 'A': count += 1;  break;
			case 'E': count += 1;  break;
			case 'I': count += 1;  break;
			case 'O': count += 1;  break;
			case 'U': count += 1;  break;
			default: break;
			}			
		}
		System.out.println("Vocale: " + count);
	}
	
}

package curs5;

public class Homework2CuWhile {

	public static void main(String[] args) {
		// numara vocalele dintr-un string dat
		
		String text = "Eu invat Java";
		int count = 0;
		int i = 0;
		
		while(i<text.length()) {
			String uppertext = text.toUpperCase();
			switch(uppertext.charAt(i)) {
			case 'A': count += 1;  break;
			case 'E': count += 1;  break;
			case 'I': count += 1;  break;
			case 'O': count += 1;  break;
			case 'U': count += 1;  break;
			default: break;
			}
			i += 1;
		}
		System.out.println("Vocale: " + count);

	}

}

package curs7;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] textArray = new String[5];
		//java creaza String[] textArray = {null,null,null,null,null} pt ca null e valoarea default a unui string caruia nu i-am atribuit valoare
		//index of array = 0, 1, 2, 3, 4
		
		System.out.println(textArray[0]);	
		textArray[0] = "This ";
		System.out.println(textArray[0]);	
		textArray[1] = "is ";
		textArray[2] = "an ";
		textArray[3] = "array ";
		textArray[4] = "!";
		
		for(int i=0; i< textArray.length; i++) {
			System.out.print(textArray[i]);
		}
		
		System.out.print(Arrays.toString(textArray));
		
		//for each - enhanced loop (lucreaza pe structuri ce contin mai multe obiecte, cu e si array listul, care are marime variabila)
		for(String element : textArray) {
			System.out.print(element);
			
		}
		

	}

}

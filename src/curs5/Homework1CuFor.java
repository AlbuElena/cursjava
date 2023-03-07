package curs5;

public class Homework1CuFor {

	public static void main(String[] args) {
		// seria Fibonacci pt 9 numere
	
		int numar = 9; // numar >=2 reprezinta numarul de numere afisate
		int nr1 = 0;
		int nr2 = 1;
		int aux;
		
		System.out.print("Seria Fibonacci pentru " + numar + " numere: ");
		System.out.print(nr1 + " ");
		System.out.print(nr2 + " ");	
		
		for(int i=3; i<=numar; i++) {
			System.out.print(nr1+nr2 + " ");		
			aux = nr1;
			nr1 = nr2;
			nr2 += aux;
		}
		
	}

}
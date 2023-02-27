package curs3;

import java.util.Scanner;

// facem un calculator simplu pt operatiile de baza: +, *, -, /
// intrebam userul primul nr
// intrebam userul operatia matematica
// intrebam userul al doilea nr
// printam rezultatul: "Ex: 4+4=8"


	public class SimpleCalculator {
	
		int num1;
		int num2;
		char operation;
		int result;
		
		//televizor numara caracterele 012345678
	
		public void askTheUser () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation:");
		operation = scan.next().charAt(0);
		System.out.println("Please enter the second number:");
		num2 = scan.nextInt();	
		}
		
	
		public void calculator () {
		
			if(operation == '+' ) { 
			result = num1 + num2;
			printResult();
				
			}else if(operation == '-') {
				result = num1-num2;
				printResult();
			}else if(operation == '*' || operation == 'x')  {
				result = num1*num2;
				printResult();
			}else if(operation == '/' || operation == ':') {
				result = num1/num2;
				printResult();
			} else System.out.println("Wrong operation");
				
		 }
		
	public void printResult() {
		System.out.println(num1 + " " + operation + " "+ num2 + " = " + result);
		
	}

}

package curs6;

public class MethodOverload {

	public static void main(String[] args) {

		MethodOverload obj = new MethodOverload();
		System.out.println(obj.multiply(3.5, 3));
		
		System.out.println("Text");
		System.out.println(123);
		System.out.println('c');
	}
	
	
	public int multiply(int num1, int num2) {
		
		return num1*num2;
	}
	
	public double multiply(double num1, double num2) {
		
		return num1*num2;
	}
	

}

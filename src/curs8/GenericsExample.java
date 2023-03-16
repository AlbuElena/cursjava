package curs8;

public class GenericsExample {

	public static void main(String[] args) {
	
		GenericsExample obj = new GenericsExample();
		obj.printDetalis(123);
		obj.printDetalis("Text");
		obj.printDetalis('c');
		obj.printDetalis(12.35);

	}

	public <T> void printDetalis(T obj) {
		System.out.println("Obiectul meu este : " + obj);
	}
	
	/*
	public void printDetalis(String text) {
		
		System.out.println("Obiectul meu este : " + text);
	}
	
	public void printDetalis(int nr) {
		
		System.out.println("Obiectul meu este : " + nr);
	}
*/
}

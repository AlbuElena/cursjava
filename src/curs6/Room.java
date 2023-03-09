package curs6;

public class Room {
	
	private int lenght;
	private int width;
	
	String culoare = "galben";
	
	public Room(int lenght, int width) {//este constructorul, metoda din clasa care ma ajuta sa instantiez clasa
		this.lenght = lenght;
		this.width = width;
	}
	
	public int calculateSquareArea() {
		return lenght * lenght;
	}
	public int calculateRectangleArea() {
		return lenght * width;
	}

}

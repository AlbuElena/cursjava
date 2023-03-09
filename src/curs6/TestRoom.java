package curs6;

public class TestRoom {

	public static void main(String[] args) {
		
		Room hol = new Room(4, 5);
		//bucatarie.lenght = 4;
		//bucatarie.width = 5;
		
		Baie baie = new Baie(0,0);
		
		System.out.println(hol.calculateRectangleArea());
		
		System.out.println(baie.culoareBaie());
		
		

	}

}

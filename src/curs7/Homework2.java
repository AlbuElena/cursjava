package curs7;

public class Homework2 {

	public static void main(String[] args) {
		// verificare duplicate in array
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		
		for (int i=0; i < myStringArray.length -1; i++) {
			for(int j=i+1; j < myStringArray.length; j++) {
				
				if(myStringArray[i] == myStringArray[j]) {
					System.out.println("Nume duplicat " + myStringArray[i]);
					break;
				}
			}
		}

	}

}

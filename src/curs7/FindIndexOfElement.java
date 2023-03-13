package curs7;

public class FindIndexOfElement {

	//avem un array de tipo integer
	//vreau sa printam care este indexul unui anumit element
	// exp: index pt elementul 6 este 2
	//rezolvare cu for
	//rezolvare cu for each
	
	static int[] number = {3, 4, 5, 6, 8, 9};
	
	
	public static void main(String[] args) {
		rezolvareCuFor();
		rezolvareCuForEach();
		

	}
	
	public static void rezolvareCuFor() {
		for(int i=0; i<number.length; i++) {
			if(number[i] == 6) {
				System.out.println("Index pt elem 6 este:" + i);
			}
		}
	}
	
	public static void rezolvareCuForEach() {
		
		int i = 0;
		for(int element : number) {
			if (element ==6) {
				System.out.println("Index pt elem 6 este:" + i);
			}
			i++ ;
			
		}
	}

}

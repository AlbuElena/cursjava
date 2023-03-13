package curs7;

public class TestAnimal {

	public static void main(String[] args) {
		
		/*Animal animal = new Animal();
		animal.makeSound();
		
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		bambi.metodaAnimal();
		
		Lion simba = new Lion();
		simba.makeSound();
		simba.eatMeat();*/
		
		//Lion simba = new Lion();
		//WebDriver obj = new ChromeDriver(); - prin relatia de mostenire intre cele 2 clase se poate face
		
		Animal leu = new Lion(); // are metodele din animal doar
		leu.makeSound();
		leu.metodaAnimal();
		((Lion) leu).eatMeat();
		feedAnimal(leu);
		
		//nu se fol in testare automata asta:
		leu = new Deer();
		leu.makeSound();
		feedAnimal(leu);
		
	}
	
	public static void feedAnimal(Animal object) {
		if(object instanceof Lion) {
			System.out.println("You are getting steak");
		}else if(object instanceof Deer) {
			System.out.println("You are getting salad");
		}
		
	}

}

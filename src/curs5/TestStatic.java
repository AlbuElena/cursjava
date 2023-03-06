package curs5;

public class TestStatic {

	public static void main(String[] args) {
	
		VariableScope obj = new VariableScope(); // trebuie sa creez obiect pt ca e metoda simpla de instanta
		obj.afiseazaText();
		
		VariableScope.afiseazaAltText();  // pt ca afiseazaAltText e metoda statica 

	}

}

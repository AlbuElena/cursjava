package curs5;

public class VariableScope {
	//variabila de instanta (instance area)
	//public String nume; // adica e disponibil si in afara clasei (alta clasa din acelasi pachet sau alta clasa din int altui pachet
	//private String nume; //doar in in t clasei VariableScope
	
	String nume; //se ia defaultul
	//static area
	static String prenume;
	
	public static void afiseazaAltText() {
		System.out.println("metoda statica");
	}
	
	
	public static void main(String[] args) {
		VariableScope obiect = new VariableScope();
		System.out.println(obiect.nume);
		System.out.println(prenume);
		obiect.afiseazaText();
		afiseazaAltText();
	}
	
	public void afiseazaText() {
		String text = "Text";//var locala
		System.out.println(text);
		System.out.println(nume);
	}

}

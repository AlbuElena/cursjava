package curs6;

public class Baie extends Room {

	public Baie(int lenght, int width) {
		super(lenght, width);
	}
	
	
	String culoare = "verde";
	
	public String culoareBaie() {
		return super.culoare; // super e referinta catre clasa parinte, deci returneaza ce e in clasa parinte
	}
	

}

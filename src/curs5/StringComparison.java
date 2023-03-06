package curs5;

public class StringComparison {

	public static void main(String[] args) {
		// sa nu comparam stringurile cu == ci cu equals
		String s1 = "masina";
		String s2 ="masina";
		String s3 = new String("masina");
	

		System.out.println(s1 == s2); //va afisa TRUE 
		System.out.println(s1 == s3); //va afisa false
		
		System.out.println(" -------------------");
		System.out.println(s1.equals(s3)); //va afisa true

	}

}

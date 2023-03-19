package curs8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) throws IOException {
		// caloriile legumelor
		
		InputStream inputStream = new FileInputStream("legume.properties");
		Properties file = new Properties() ;
		file.load(inputStream);
						
		H1PropertiesFile propFile = new H1PropertiesFile();
		propFile.writePropertiesFile();
		int count = 0;
		
		do {
		System.out.println("Introduceti leguma pe care vreti sa o cumparati:");
		Scanner scan = new Scanner(System.in);
		String leguma = scan.next();
			
		if(file.keySet().contains(leguma)) {
			propFile.readPropertiesFile(leguma);
			count+=1;
			}else {System.out.println("Nu vindem aceasta leguma");}
		}while (count<1);
		
	}
		
}

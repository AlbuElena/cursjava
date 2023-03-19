package curs8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class H1PropertiesFile {
	
	public void writePropertiesFile() throws IOException  {
		try {		
	
			OutputStream outputStream = new FileOutputStream("legume.properties");
			
			Properties file = new Properties();
			file.setProperty("ardei", "40");
			file.setProperty("cartof", "89");
			file.setProperty("morcov", "58");
			file.setProperty("mazare", "96");
			file.setProperty("vinete", "77");
			
			file.store(outputStream, "Am salvat fisierul legume-calorii");	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readPropertiesFile (String key) throws IOException {
		try {
		
		InputStream inputStream = new FileInputStream("legume.properties");
		
		Properties file = new Properties() ;
		file.load(inputStream);
		
		System.out.println("Leguma aleasa de tine are " + file.getProperty(key) + " calorii");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

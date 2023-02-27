package curs3;
import java.util.Scanner;
public class IfElseIfExample  {
	/** intrebam userul punctajul unui test si ii atribuim un calificativ
	 *  a obtinut <=90 --> B
	 *  a obtinut <=  80 --> C
	 *  a obtinut <= 70 --> D
	 *  a obtinut <= 60 --> E
	 *  peste 90 --> A
	 */
	public static void main(String[] args) 
		{
	
		
		System.out.println("Ce punctaj ai obtinut?");
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
		char calificativ ;
		
		if(punctaj <= 60) { 
			calificativ = 'E';
			
		}else if (punctaj <=70) {
			calificativ = 'D';
		}else if (punctaj <=80) { 
			calificativ ='C';
		}else if (punctaj <=90) { 
			calificativ = 'B';
		}else  calificativ = 'A';
		System.out.println("Calificativul primit este: " + calificativ);
		}		
			
	}


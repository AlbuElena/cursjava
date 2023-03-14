package curs7;

public class InsuficientFundsException extends Exception {
	
	public  InsuficientFundsException(String mesaj) {
		
		super("Insuficient funds for transaction");
	}

}



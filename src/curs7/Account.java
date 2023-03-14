package curs7;

public class Account {
	
	private int accountNumber;
	public double balance ;
	public Customer accountOwner;

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void withdraw(double withdrawValue) throws InsuficientFundsException  {
		throw new InsuficientFundsException("Insuficient funds for transaction");
	}

}

package curs7;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		
		this.setAccountNumber(accountNumber);
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	
	@Override
	public void withdraw(double withdrawValue) throws InsuficientFundsException {
		if(withdrawValue>balance) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
		}else {
			balance -= withdrawValue;
		}
	}

}

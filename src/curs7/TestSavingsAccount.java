package curs7;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsuficientFundsException {
		
		double withdrawValue;
			
		Customer customer = new Customer("Ion", "Bucuresti", "ion@email.com");
		SavingsAccount saveAccount = new SavingsAccount(555, 150, customer);
		
		System.out.println("Hi " + customer.getName());
		System.out.println("Please enter the amount to widraw:");
		Scanner scan = new Scanner(System.in);
		withdrawValue = scan.nextDouble();
		
		try {
		saveAccount.withdraw(withdrawValue);
		System.out.println("Please pick you money!");
		System.out.println("Your new balance is: " + saveAccount.balance);
		System.out.println("Thank you for using our ATM!");
		
		}catch (InsuficientFundsException e) {
		System.out.println("The amount you entered is greater than the available balance:" + saveAccount.balance );
		System.out.println("Thank you for using our ATM!");
		e.printStackTrace();
		}
	}
}

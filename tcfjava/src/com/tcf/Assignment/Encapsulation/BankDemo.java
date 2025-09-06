package com.tcf.Assignment.Encapsulation;

public class BankDemo {
	public static void main(String[] args) {
		
		 BankAccount account = new BankAccount("11082005", "Rahul",500.0);

	        // Display initial details
	        account.displayAccountInfo();

	        // Deposit money
	        account.deposit(700.0);

	        // Withdraw money
	        account.withdraw(200.0);

	        // Try withdrawing more than balance
	        account.withdraw(2000.0);

	        // Display final details
	        account.displayAccountInfo();
	}
}

package com.simplilearn.exceptionhandling.bank;

import com.simplilearn.exceptionhandling.bank.exception.AccountNotFound;
import com.simplilearn.exceptionhandling.bank.exception.InvalidTransaction;

public class Test {

	public static void main(String[] args) {

		// create a account oject
		Account account = new Account(10001, 10001, 766786.20, "Iron man", "Iron Bank");

		// create a bank operation object
		BankOperation operation = new BankOperation();

		// call show balance
		double balance = 0;
		try {
			balance = operation.showBalance(account);
		} catch (AccountNotFound e) {
			System.out.println("Exception has occured ! "+e.getClass());
			System.out.println("Exception message ! "+e.getMessage());
		}

		System.out.println("The user " + account.username + " account has balance " + balance);
		System.out.println("-------------");

		try {
			// call withdraw amount
			double newBalance = operation.withdrawAmount(account, 766787.2);

			System.out.println("After withdraw The user " + account.username + " account has balance " + newBalance);
			System.out.println("-------------");
			
		} catch (InvalidTransaction e) {
			System.out.println("Exception has occured ! "+e.getClass());
			System.out.println("Exception message ! "+e.getMessage());
		}
		
		// call deposit amount
		
	}

}

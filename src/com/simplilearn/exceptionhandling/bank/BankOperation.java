package com.simplilearn.exceptionhandling.bank;

import com.simplilearn.exceptionhandling.bank.exception.AccountNotFound;
import com.simplilearn.exceptionhandling.bank.exception.InvalidTransaction;;
public class BankOperation {

	// show balance
	public double showBalance(Account account) throws AccountNotFound {
		if(account== null) { 
			throw new AccountNotFound("Account does not exist !");
		}
		return account.balance;
	}

	// withdraw amount
	public double withdrawAmount(Account account, double amount) {

		if (amount < account.balance && amount > 0) {
			// account.balance = account.balance - amount;
			account.balance -= amount;
		} else {
			throw new InvalidTransaction("Invalid amount for withdraw !");
		}
		return account.balance;
	}

	// deposit amount
	public double depositeAmount(Account account, double amount) {
       double dayLimit =1000;
       
		if (amount < dayLimit && amount > 0) {
			// account.balance = account.balance + amount;
			account.balance += amount;
		} else {
			throw new InvalidTransaction("Invalid amount for deposit");
		}
		return account.balance;
	}

}

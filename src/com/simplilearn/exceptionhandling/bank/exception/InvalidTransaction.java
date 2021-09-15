package com.simplilearn.exceptionhandling.bank.exception;

//create a unchecked exception extends with RuntimeException
public class InvalidTransaction extends RuntimeException{
	
	String message;

	public InvalidTransaction(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Transaction [message=" + message + "]";
	}
}

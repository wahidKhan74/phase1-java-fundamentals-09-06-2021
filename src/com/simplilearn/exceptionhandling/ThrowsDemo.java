package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {
	
	// throws : throws keyword is used to declare exception.
	
	public static void main(String[] args) {
		
		try {
			try {
				ageValidator(30);
			} catch (Exception e) {
				System.out.println("Exception Occured ! " + e.getClass());
			}
			try {
				ageValidator(0);
			} catch (Exception e) {
				System.out.println("Exception Occured ! " + e.getClass());
			}			
			ageValidator(-20);
		} catch (IOException e) {
			System.out.println("Exception Occured ! " + e.getClass());
		}

	}
	
	public static void ageValidator(int age) throws IOException {
		if(age>20) {
			System.out.println("Valid age !");
		} else {
			throw new IOException("Invalid age");
		}
	}
}

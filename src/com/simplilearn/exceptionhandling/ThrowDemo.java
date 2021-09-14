package com.simplilearn.exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// throw :: throw keyword is used to throw an exception

		ageValidator(20);
		try {
			ageValidator(2);
		} catch (Exception ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		}
		
		
		
		try {
			userNameValidator("John Smith");
			// userNameValidator("");
			userNameValidator(null);
		} catch (Exception ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		}
		
	}
	
	public static void ageValidator(int age) {
		if(age> 18) {
			//logic
			System.out.println("Your age is a valid age, Welcome to online voting !");
		} else {
			throw new RuntimeException("Not a valid age !");
		}
	}

	private static void userNameValidator(String username) {
		if(username != null && !(username.equals("")) ) {
			System.out.println("Valid username !");
		} else {
			throw new RuntimeException("Not a valid username !");
		}
	}
}

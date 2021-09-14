package com.simplilearn.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Program has Initiated !");

		try {
			int totalBalance = 5000;
			int userCount = 20;

			int result = totalBalance / userCount;

			System.out.println("Result : " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		} finally {
			System.out.println("Always excute !");
		}

		System.out.println("Program is completed !");

	}

}

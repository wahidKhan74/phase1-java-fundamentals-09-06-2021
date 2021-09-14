package com.simplilearn.exceptionhandling;

public class ExceptionHandlingWithMethods {

	public static void main(String[] args) {

//		transaction(20);
//		transaction(0);
//		transaction(100);
//
//		lengthCalculator("John is Happy");
//		lengthCalculator(null);
//		lengthCalculator("John is Angry");
//
//		numberConvertor("7456");
//		numberConvertor("xyx7456");
//		numberConvertor("78856");

		multiTask2("9988", 200);

		multiTask2("Hello", 200);
		multiTask2("Hello", 0);
		multiTask2(null, 300);
	}

	private static void transaction(int userCount) {
		try {
			int totalBalance = 5000;
			int result = totalBalance / userCount;
			System.out.println("Result : " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Rollback !");
		}
	}

	private static void lengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Input str length : " + length);
		} catch (NullPointerException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		}
	}

	private static void numberConvertor(String number) {
		try {
			int result = Integer.parseInt(number);
			System.out.println("Result : " + result);
		} catch (NumberFormatException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		}

	}

	private static void multiTask(String str, int number) {

		try {
			float result = 2000 / number;
			int length = str.length();
			int response = Integer.parseInt(str);

			System.out.println("Result : " + result);
			System.out.println("Str lenth : " + length);
			System.out.println("Converted number  : " + response);

		} catch (ArithmeticException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		} catch (NumberFormatException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		} catch (NullPointerException ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		}

	}

	private static void multiTask2(String str, int number) {

		try {
			float result = 2000 / number;
			int length = str.length();
			int response = Integer.parseInt(str);

			System.out.println("Result : " + result);
			System.out.println("Str lenth : " + length);
			System.out.println("Converted number  : " + response);

		} catch (Exception ex) {
			System.out.println("Exception Occured ! " + ex.getClass());
		}

	}

}

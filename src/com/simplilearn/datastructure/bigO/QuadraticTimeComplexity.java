package com.simplilearn.datastructure.bigO;

public class QuadraticTimeComplexity {

	public static void main(String[] args) {
		
		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		
		// displayAll2Pairs(items);
		
		displayAll3Pairs(items);
	}
	// This methods run in : O(n*n*n) => O(n^3)  => O(n^2) => Exponential / Quadratic Time Complexity
	private static void displayAll3Pairs(int[] items) {
		for(int first : items) {
			for(int second: items) {
				for(int third: items) {
					System.out.println(first +" "+second +" "+third);
				}
			}
		}
		
	}

	// This methods run in : O(n*n) => O(n^2) =>Quadratic Time complexity
	private static void displayAll2Pairs(int[] items) {
		for(int first : items) {
			for(int second: items) {
				System.out.println(first +" "+second);
			}
		}
	}
}

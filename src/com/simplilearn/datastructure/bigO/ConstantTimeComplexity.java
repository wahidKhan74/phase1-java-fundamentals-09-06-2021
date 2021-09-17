package com.simplilearn.datastructure.bigO;

public class ConstantTimeComplexity {

	public static void main(String[] args) {

		// array
		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90 }; // n
		
		displayOne(items);
		
		int index = 7;
		displayOneByIndex(items,index);
		
		displayTwo(items);
	}

	// This methods run is O(1+1 )= O(2) => O(1)
	private static void displayTwo(int[] items) {
		System.out.println(items[6]);
		System.out.println(items[5]);
	}

	// This methods run in O(1)
	private static void displayOneByIndex(int[] items, int index) {
		System.out.println(items[index]);
	}

	//This methods runs in O(1)  -> Constant Time Complexity
	private static void displayOne(int[] items) {
		System.out.println(items[5]);
	}

}

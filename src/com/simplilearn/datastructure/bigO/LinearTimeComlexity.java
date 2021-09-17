package com.simplilearn.datastructure.bigO;

public class LinearTimeComlexity {

	public static void main(String[] args) {
		
		// array
		int [] items = {10,20,30,40,50,60,70,80,90};  //n
		
		displayAll(items) ;

		
		displayOne(items, 2);
	}

	// This method runs in O(1)  -> Constant Time Complexity.
	private static int displayOne(int[] items, int index) {
		return items[index];
	}

	// This method runs in O(n)  -> Linear Time Complexity
	private static void displayAll(int[] items) {
		for(int item : items) {
			System.out.println(item);
		}
	}
	
	

}

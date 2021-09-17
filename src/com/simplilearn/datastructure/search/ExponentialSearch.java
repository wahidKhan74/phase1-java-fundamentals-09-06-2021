package com.simplilearn.datastructure.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {

		int inputs[] = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		int searchVal = -1;
		
		int searchIndex = exponentialSearch(inputs, searchVal);

		if(searchIndex>=0) {
			System.out.println("The search element : "+searchVal);
			System.out.println("It is found at index : "+searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}
	}

	//This methods run in best time complexity as O(1) 
	// worst time complexity is O(long2 n)
	private static int exponentialSearch(int[] inputs, int value) {
		
		// find range :- 
		// 1. start with index 0
		if(inputs[0]==value ) {
			return 0;
		}
		// 2. doubling method
		int i =1;
		while(i<inputs.length && inputs[i] <= value) {
			i = i *2;
		}
		// apply binary search on range element
		return Arrays.binarySearch(inputs, i/2, Math.min(i,inputs.length), value);
	}

}

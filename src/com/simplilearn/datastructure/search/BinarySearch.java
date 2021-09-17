package com.simplilearn.datastructure.search;

public class BinarySearch {

	public static void main(String[] args) {


		int inputs[] = {-22,-15,-3,-1,7,9,20,35,55};
		
		int searchVal = 550;
		
		int searchIndex = binarySearch(inputs, searchVal);
				
		if(searchIndex>=0) {
			System.out.println("The search element : "+searchVal);
			System.out.println("It is found at index : "+searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}
	}

	//iterative binary search
	// This methods runs in : Logarithmic time complexity. O(log n).
	private static int binarySearch(int[] inputs, int value) {
		
		int start =0;
		int end = inputs.length-1;
		
		while(start<=end) {
			//middpoint
			int middpoint = (start+end)/2;
			// System.out.println(middpoint);
			// middpoint is search
			if(inputs[middpoint]==value) {
				return middpoint;
			} 
			//search in upper half / right half
			else if(inputs[middpoint] < value) {
				start = middpoint +1;
			}
			//search in lower half / left half
			else {
				end = middpoint -1;
			}
		}
		return -1;
	}

}

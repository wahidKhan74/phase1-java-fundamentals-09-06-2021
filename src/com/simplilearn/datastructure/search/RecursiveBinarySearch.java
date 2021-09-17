package com.simplilearn.datastructure.search;

public class RecursiveBinarySearch {

	public static void main(String[] args) {


		int inputs[] = {-22,-15,-3,-1,7,9,20,35,55};
		
		int searchVal = 20;
		
		int start =0;
		int end = inputs.length-1;
		
		int searchIndex = binarySearch(inputs, start, end, searchVal);
				
		if(searchIndex>=0) {
			System.out.println("The search element : "+searchVal);
			System.out.println("It is found at index : "+searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}
	}

	//iterative binary search
	// This methods runs in : Logarithmic time complexity. O(log n).
	private static int binarySearch(int[] inputs,int start, int end, int value) {
			// breaking condition -> if value not found
		    if(start> end) {
		    	return -1;
		    }
			//middpoint
			int middpoint = (start+end)/2;
			// middpoint is search
			if(inputs[middpoint]==value) {
				return middpoint;
			} 
			//search in upper half / right half
			else if(inputs[middpoint] < value) {
				return binarySearch(inputs, middpoint+1, end, value);
			}
			//search in lower half / left half
			else {
				return binarySearch(inputs, start, middpoint-1, value);
			}
	}

}

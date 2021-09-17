package com.simplilearn.datastructure.search;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] items= {20,50,35,-15,7,1,55,-22};
		
		int searchVal = -35;
		
		int searchIndex = linearSearch(items,searchVal);
		if(searchIndex>=0) {
			System.out.println("The search element : "+searchVal);
			System.out.println("It is found at index : "+searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}

	}

	// This methods run in O(n) => linear time complexity.
	private static int linearSearch(int[] items, int searchVal) {
		//search through an complete array
		for (int index = 0; index < items.length; index++) {
			if(items[index]==searchVal) {
				return index;
			}
		}
		return -1;
	}

}

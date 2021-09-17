package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] inputs = {20, 35, -15, 5 , 55, 2, -18};   
		
		System.out.println("Before sort : "+Arrays.toString(inputs));
		selectionSort(inputs);
		System.out.println("After sort : "+Arrays.toString(inputs));
	}

	//This method has time complexity O(n^2)
	private static void selectionSort(int[] inputs) {
		// iterate over unsorted partition
		for (int lastUnsortedIndex = inputs.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--) {
			int largestIndex= 0;
			// comparative for
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if(inputs[i] > inputs[largestIndex])
					largestIndex =i;
			}
			swap(inputs, largestIndex, lastUnsortedIndex);
		}
	}

	private static void swap(int[] inputs, int a, int b) {
		if(a==b) {
			return;
		}
		int tmp = inputs[a];
		inputs[a]= inputs[b];
		inputs[b] = tmp;
	}

}

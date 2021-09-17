package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] inputs = { 220, 35, -150, 5, 550, 2, -18 };

		System.out.println("Before sort : " + Arrays.toString(inputs));
		buubleSort(inputs);
		System.out.println("After sort : " + Arrays.toString(inputs));

	}

	// This method runs in O(n^2).
	private static void buubleSort(int[] inputs) {
		//outer for loop for iterating unsorted portion.
		for (int lastUnSortedIndex =  inputs.length-1; lastUnSortedIndex >0; lastUnSortedIndex--) {
			//comparative loop
			for (int i = 0; i < lastUnSortedIndex; i++) {
				if(inputs[i]> inputs[i+1]) {
					swap(inputs, i , i+1);
				}
			}
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

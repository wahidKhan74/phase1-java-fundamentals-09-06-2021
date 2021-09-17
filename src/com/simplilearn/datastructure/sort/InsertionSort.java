package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] inputs = { 220, 35, -150, 5, 550, 2, -18 };
		
		System.out.println("Insertion Sort");
		System.out.println("Before sort : " + Arrays.toString(inputs));
		insertionSort(inputs);
		System.out.println("After sort : " + Arrays.toString(inputs));

	}

	private static void insertionSort(int[] inputs) {
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < inputs.length; firstUnsortedIndex++) {
			int element = inputs[firstUnsortedIndex];
			int index;
			// comparative loop
			for (index = firstUnsortedIndex; index > 0 && inputs[index-1] > element; index--) {
				inputs[index] = inputs[index-1];
			}
			// insert element.
			inputs[index] = element;
		}
	}
}

package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] inputs = { 220, 35, -150, 5, 550, 2, -18 };

		System.out.println("Insertion Sort");
		System.out.println("Before sort : " + Arrays.toString(inputs));

		int start = 0;
		int end = inputs.length;

		mergeSort(inputs, start, end);

		System.out.println("After sort : " + Arrays.toString(inputs));

	}

	// This method runs in : O(log n);
	private static void mergeSort(int[] inputs, int start, int end) {
		// break logic for recursion
		if (end - start < 2) {
			return;
		}

		// 1. divide array elements
		int mid = (start + end) / 2;

		// 2. call mergesort for first half
		mergeSort(inputs, start, mid);

		// 3. call mergesort for second half
		mergeSort(inputs, mid, end);
		
		// 4. call data merge
		merge(inputs, start, mid, end);

	}

	private static void merge(int[] inputs, int start, int mid, int end) {
		//break logic
		if(inputs[mid-1] < inputs[mid]) {
			return ;
		}
		
		int i = start;
		int j = mid;
		int tempIndex =0;
		//create temp array for sorted values
		int[] temp = new int[end-start];
		
		// start comparison
		while(i<mid && j< end) {
			temp[tempIndex++] = (inputs[i]<= inputs[j]) ? inputs[i++] : inputs[j++];
		}
		
		// copy data from temp array to actual array
		System.arraycopy(inputs, i, inputs, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, inputs, start, tempIndex);
		
	}

}

package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayOrderStatisticDemo {

	public static void main(String[] args) {
		// Array order statistic identify kth smallest & largest element.

		int[] items = { -15, 23, 40, 34, 78, 67, 50 };

		// kth smallest element
		int pos = 2;
		int result = findKthSmallest(items, pos);
		System.out.println("The pos " + pos + " based smallest element " + result);

		// kth largest element
		int result2 = findKthLargest(items, pos);
		System.out.println("The pos "+pos+" based largest element "+result2);
	}

	private static int findKthLargest(int[] items, int pos) {
		// step 1 : sort array in ascending order
		Arrays.sort(items);

		// return data with kth position : index = items.length-pos;
		return items[items.length-pos];
	}

	private static int findKthSmallest(int[] items, int pos) {

		// step 1 : sort array in ascending order
		Arrays.sort(items);

		// return data with ktth position : index = pos-1;
		return items[pos - 1];
	}

}

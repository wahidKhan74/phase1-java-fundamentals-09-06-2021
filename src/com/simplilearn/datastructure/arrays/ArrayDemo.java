package com.simplilearn.datastructure.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] items = {-15, 23, 40 ,34,78,67,50};
		
		displayForward(items);
		System.out.println("------------------------");
		displayReverse(items);
	}

	private static void displayReverse(int[] items) {
		for (int index = items.length-1 ; index >=0; index--) {
			System.out.println("The index : "+index +" & avalue : "+items[index]);
		}
		
	}

	private static void displayForward(int[] items) {
		// forward iteration
		for(int index=0; index<items.length; index++) {
			System.out.println("The index : "+index +" & avalue : "+items[index]);
		}
	}

}

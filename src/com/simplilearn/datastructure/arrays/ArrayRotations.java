package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayRotations {

	public static void main(String[] args) {
		
		int[] items = {-15, 23, 40 ,34,78,67,50};
		
		System.out.println("Before Rotation : "+Arrays.toString(items));
		rotateRight(items,5);
		System.out.println("Ater Rotation : "+Arrays.toString(items));
		
		System.out.println("------------------------");
		
		System.out.println("Before Rotation : "+Arrays.toString(items));
		rotateLeft(items,3);
		System.out.println("Ater Rotation : "+Arrays.toString(items));

	}

	private static void rotateLeft(int[] items, int rCount) {
		
		if(rCount> items.length)
			rCount = rCount % items.length;
		
		// create temp array
		int temp[] = new int[items.length];
		
		// shift data element into temp
		for(int i =0 ; i<rCount; i++) {
			temp[i]= items[items.length-rCount+i]; 
			// System.out.println("temp[i]" +temp[i] +"   "+(items.length-rCount+i));
		}
		// rotate actual actual array
		int j= 0;
		for(int i= rCount; i<items.length; i++) {
			temp[i] = items[j];
			j++;
		}
		
		//copy data from temp array to items
		System.arraycopy(temp, 0, items, 0, items.length);
		
	}

	private static void rotateRight(int[] items, int rotateCount) {
		
		// create temp array
		int temp[]= new  int[rotateCount];
		
		// shift element to temp array
		for (int i = 0; i < rotateCount; i++) {
			temp[i] = items[i];
		}
		
		// rotate actual array
		for (int j = rotateCount; j < items.length; j++) {
			items[j-rotateCount] = items[j];
		}
		
		// copy temp array to actual array
		for (int i = 0; i < rotateCount; i++) {
			items[i+items.length-rotateCount] = temp[i];
		}
		
	}
	

}

package com.algo.sort;

public class SelectionSort {
	/* Objective: Select smallest element in array and place it to it's right position.
	 * start from 1st element and call it cursor. 
	 * Repeat following until cursor reaches at the last. 
	 * search the smallest in the array, once found note it's index. 
	 * now swap the smallest element found with element at cursor. 
	 * move cursor to one place right. 
	 */
	public static void sort(int[] sortMe) {
		
		
		for(int pointer = 0; pointer<sortMe.length ; pointer++) {
			int smallestIdx = pointer;
			int smallest = sortMe[pointer];
			
			for(int j = pointer+1; j < sortMe.length ;j++) {
				if(smallest > sortMe[j]) {
					smallest = sortMe[j];
					smallestIdx = j;
				}
			}
			
			int temp  = sortMe[pointer];
			sortMe[pointer] = smallest;
			sortMe[smallestIdx]  = temp;
		}
		
		
		for(int x : sortMe) {
			System.out.println(x);
		}
	}
	
	public static void main(String args[]) {
		int[] sortMe = {4,2,3,1,5};
		sort(sortMe);
	}

}

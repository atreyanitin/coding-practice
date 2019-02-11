package com.algo.sort;

public class OneMoreQuickSort {

	/*
	 * Objective is to bring Pivot to the right place.
	 * and recursively follow same on right and left of pivot array. 
	 */
	public static void quickSort(int[] sortMe, int start, int end) {
		if(start>end) 
			return;
		
		int p = partition(sortMe, start, end);
		quickSort(sortMe, 0, p-1);
		quickSort(sortMe, p+1, end);
	}

	public static int partition(int[] sortMe, int start, int end) {

		int pivot = sortMe[end];
		int pIdx = start;
		int i = start;
		for (; i < end; i++) {
			if (sortMe[i] < pivot) {
				swap(sortMe, i, pIdx);
				pIdx++;
			}
		}
		swap(sortMe, i, pIdx);
		return pIdx;
	}

	private static void swap(int[] sortMe, int i, int j) {
		int temp = sortMe[i];
		sortMe[i] = sortMe[j];
		sortMe[j] = temp;
	}
	
	public static void main(String args[]) {
		int[] sortMe = new int[] {7,2,1,6,8,5,3,4};
		quickSort(sortMe, 0, 7);
		
		for(int i : sortMe) {
			System.out.println(i);
		}
		
		
	}

}

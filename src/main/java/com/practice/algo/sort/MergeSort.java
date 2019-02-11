package com.practice.algo.sort;

/**
 * @author ngoswami
 *  
 */
public class MergeSort {

	public static void mergeSort(int[] sortMe) {

		if (sortMe.length < 2) {
			return;
		}
		// divide array into two of same size
		// size = 7 => mid =(7-1)/2 = 3
		// size = 6 => mid =(6-1)/2 = 2
		// left[2+1] right[5-2]
		// {1,2,3,4,5,6,7}

		int mid = (sortMe.length - 1) / 2;
		int leftLength = mid + 1;
		int rightLength = sortMe.length - leftLength;
		int[] left = new int[leftLength];
		int[] right = new int[rightLength];

		System.arraycopy(sortMe, 0, left, 0, leftLength);
		System.arraycopy(sortMe, mid + 1, right, 0, rightLength);

		mergeSort(left);
		mergeSort(right);
		mergeTwo(left, right, sortMe);
	}

	
	/** Size of left and right array can be different
	 * @param left
	 * @param right
	 * @param sortMe
	 */
	public static void mergeTwo(int[] left, int[] right, int[] sortMe) {

		int i = 0, j = 0, k = 0;
		for (; i < left.length && j < right.length;) {
			if (left[i] < right[j]) {
				sortMe[k] = left[i];
				i++;
				k++;
			}

			else if (left[i] > right[j]) {
				sortMe[k] = right[j];
				j++;
				k++;
			}
		}
		
		//Means left array has few elements not being processed.
		if (i >= left.length) {
			while (j < right.length) {
				sortMe[k] = right[j];
				j++;
				k++;
			}
		}
		
		//Means right array has few elements not being processed.
		else if (j >= right.length) {
			while (i < left.length) {
				sortMe[k] = left[i];
				i++;
				k++;
			}

		}

		return;
	}

	public static void main(String args[]) {
		int[] sortMe = new int[] { 3, 1, 4, 6, 2, 5, 7 };
		mergeSort(sortMe);
		for (int i : sortMe) {
			System.out.println(i);
		}
	}

}

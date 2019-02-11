package com.practice.algo;

public class InsertionSort {

	private static int[] sort(int[] sortMe) {
		int i = 0;
		int j = 1;
		for (; j < sortMe.length - 1; j++) {
			int key = sortMe[j];
			for (; key > sortMe[i]; i++) {
			}
			if (i < j) {
				int temp = sortMe[i];
				sortMe[i] = key;
				for (int k = j; k < i; k--) {
					sortMe[k] = sortMe[k - 1];
				}
			}
		}

		return sortMe;
	}

	public static void main(String args[]) {
		int[] sortMe = { 2, 5, 4, 6, 1, 3 };

		System.out.println(sort(sortMe));
	}

}

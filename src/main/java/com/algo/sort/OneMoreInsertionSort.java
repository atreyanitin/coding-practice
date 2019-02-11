package com.algo.sort;

/*
 * Objective: Sort array from left, minimum size 2 at start. Left most array should always be sorted.
 * beginIndex = 0, pointer = 1
 * repeat until pointer reaches to end
 * repeat until pointer reaches to beginning 
 * compare element at pointer with element at pointer-1
 * if element at pointer-1 is smaller, swap
 */
public class OneMoreInsertionSort {

	public static void sort(int[] sortMe) {

		for (int cursor = 1; cursor < sortMe.length; cursor++) {
			for (int i = cursor; i > 0; i--) {
				if (sortMe[i - 1] > sortMe[i]) {
					int temp = sortMe[i];
					sortMe[i] = sortMe[i - 1];
					sortMe[i - 1] = temp;
				}
			}
		}

		for (int x : sortMe) {
			System.out.println(x);
		}

	}

	public static void main(String args[]) {
		int[] sortMe = { 6, 3, 1, 5, 2, 4 };
		sort(sortMe);
	}

}

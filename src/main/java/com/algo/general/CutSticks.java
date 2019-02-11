package com.algo.general;

import java.util.Scanner;

public class CutSticks {

	static int[] cutTheSticks(int[] arr) {

		int[] result = new int[arr.length];
		int count = 0;
		
		for (int i = 0;i < arr.length && !allDone(arr); i++) {
			int min = findMin(arr);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] - min >= 0) {
					arr[j] = arr[j] - min;
					count++;
				}
			}
			result[i] = count;
			count = 0;

		}
		return result;
	}

	private static boolean allDone(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				return false;
		}
		return true;
	}

	private static int findMin(int[] arr) {
		int smallest = Integer.MAX_VALUE;
	    for(int i=0; i<arr.length; i++) {
	        if(arr[i] > 0 && arr[i]<smallest) {
	            smallest = arr[i];
	        }
	    }
	    return smallest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = cutTheSticks(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}

}

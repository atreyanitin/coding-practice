package com.practice.algo.sort;

public class InsertionSort {
	
	
	public static void sort(int[] sortMe){
		/*
		 * Objective: Move the smallest value to the left
		 *   
		 */
		for(int i = 1; i< sortMe.length;i++){
			
			int hole = i;
			int value = sortMe[hole];
			while(hole >0 && value<sortMe[hole-1]){
				int temp = sortMe[hole-1];
				sortMe[hole-1] = value;
				sortMe[hole] = temp;
				hole--;
			}
			
		}
		
		for(int k = 0; k < sortMe.length; k++)
			System.out.println(sortMe[k]);
	}
	
	public static void main(String args[]){
		int[] sortMe = {3,2,1,5,4};
		InsertionSort.sort(sortMe);
	}

}

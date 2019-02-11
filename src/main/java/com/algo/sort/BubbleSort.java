package com.algo.sort;

public class BubbleSort {
	
	/* start from left most element and compare it with next and repeat 
	 * Objective: move the greatest element to the right
	 */
	public static void sort(int[] sortMe){
		for(int i=0; i<sortMe.length; i++){
			for (int j = 0; j<sortMe.length-1-i;j++){
				if(sortMe[j]>sortMe[j+1]){
					int temp = sortMe[j];
					sortMe[j] = sortMe[j+1];
					sortMe[j+1] = temp;
				}
			}
			
		}
		for(int k = 0; k < sortMe.length; k++)
			System.out.println(sortMe[k]);
	}
	
	public static void main(String args[]){
		int[] sortMe = {2,3,1,5,4};
		BubbleSort.sort(sortMe);
	}

}

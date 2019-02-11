package com.algo.sort;

public class OneMoreBubbleSort {
	
	public static void sort(int[] source) {
		
		
		int rangeIndex = source.length-1;
		
		for(;rangeIndex>0;rangeIndex--) {
			
			for(int start = 0 ;start < rangeIndex;start++) {
				if(source[start]>source[start+1]) {
					int temp = source[start];
					source[start] = source[start+1];
					source[start+1] = temp;
				}
			}
			
		}
		for(int i = 0; i < source.length ; i++) {
			System.out.println(source[i]);
		}
		
	}
	
	public static void main(String args[]) {
		int[] source = {2,6,1,9,4, 8,7,3,5};
		
		sort(source);
	}

}

package com.interview.codingexc;

public class ArrayDiff {
	
	public static void main(String args[]) {
		int[] input = new int[]{6, 5, 4, 3, 2, 1};
		int diff = -1;
		for(int i = 0; i<input.length ; i++) {
			for(int j = input.length-1 ; j >i ; j--) {
				if(input[j]>input[i]) {
					int temp =  j-i;
					if(temp > diff)
						diff = temp;
					break;
				}
			}
		}
		System.out.println(diff);
	}

}

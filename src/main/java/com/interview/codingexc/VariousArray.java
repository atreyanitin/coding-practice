package com.interview.codingexc;

public class VariousArray {
	
	public static void main(String args[]){
		int[] numbers = new int[]{1,3,9,7,4,5};
		filterSum10(numbers);
	}
	
	public static void filterSum10(int[] numbers){
		int[][] result = new int[2][2];
		int k = 0;
		for(int i=0; i<numbers.length && k!=2; i++){
			for(int j=i+1; j<numbers.length&& k!=2;j++){
				if(numbers[i]+ numbers[j]==10){
					result[i][0] = numbers[i];
					result[i][1] = numbers[j];
					k++;
				}
			
			}
		}
		System.out.println(result[0][0] +" : "+ result[0][1]);
		System.out.println(result[1][0] +" : "+ result[1][1]);
	}

}

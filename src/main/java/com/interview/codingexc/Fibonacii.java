package com.interview.codingexc;

public class Fibonacii {
	
	public static int find(int n) {
		
		if(n ==1 || n ==0)
			return 1;
		return find(n-1) + find(n-2);
		
	}
	
	public static void main(String args[]){
		System.out.println(find(4));
	}

}

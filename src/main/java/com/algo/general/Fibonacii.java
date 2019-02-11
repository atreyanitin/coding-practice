package com.algo.general;

public class Fibonacii {
	
	public static int fibonacii(int x) {
		if(x==2 ) return 1;
		if(x==1) return 1;
		return fibonacii(x-2) + fibonacii(x-1);
	}
	
	public static void main(String args[]) {
		System.out.println(fibonacii(6));
	}

}

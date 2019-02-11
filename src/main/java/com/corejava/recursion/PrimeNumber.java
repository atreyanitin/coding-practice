package com.corejava.recursion;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int input) {
		
		if(input <= 1) 
			return false;
		if (  input ==2 || input == 3) {
			return true;
		}
		if(input % 2 == 0) {
			return false;
		}
		if(input % 3 == 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		System.out.println(isPrimeNumber(139));
	}

}

package com.interview.codingexc;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String args[]) {
	//	System.out.println(1%2);
		System.out.println(intToBinary(8, 4));
		
	}
	
	public static String intToBinary (int n, int numOfBits) {
		   String binary = "";
		   for(int i = 0; i < numOfBits; ++i, n/=2) {
		      switch (n % 2) {
		         case 0:
		            binary = "0" + binary;
		            break;
		         case 1:
		            binary = "1" + binary;
		            break;
		           
		      }
		   }

		   return binary;
		}
	

}

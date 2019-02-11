package com.interview.codingexc;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

	
	public static void main(String args[]){
		int result = -1;
		try{
			
	
		
			int i = 10/0;
			
			result = 10;
		}
		catch(Exception e){
			System.out.println("Catch block");
			result = 15;
			//int j = result/0;
		}
		finally{
			
			result = 20;
		//	int j = result/0;
			System.out.println("Finally Block");
		}
		
		System.out.println("result = "+ result);
		int x1 = 16;  //0100
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.toBinaryString(8));

		System.out.println( x1 >> 1); //0010
		int x2 = -4;  //1010
		System.out.println( x2 >> 1); //0001

		
	}
}

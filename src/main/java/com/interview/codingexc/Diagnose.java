package com.interview.codingexc;

public class Diagnose {

	
	public static void main(String args[]){
		
		System.out.println("processors : "+ Runtime.getRuntime().availableProcessors());
		System.out.println("free memory : "+ Runtime.getRuntime().freeMemory());
		System.out.println("total memory : "+ Runtime.getRuntime().totalMemory());
		System.out.println("max memory : "+ Runtime.getRuntime().maxMemory());
		System.gc();
		
	}
}

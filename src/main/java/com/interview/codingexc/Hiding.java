package com.interview.codingexc;

class Parent{
	int x = 2;
	static int y = 3;
	
	public static void print(){
		System.out.println("IN Parent");

	}
}

public class Hiding extends Parent {
	int x = 4;
	static int y = 8;
	
	public static void  print(){

	System.out.println("IN Hiding");
	}
	
	public static void main(String args[]){
		Parent.print();
		Hiding.print();
		
		
	}

}

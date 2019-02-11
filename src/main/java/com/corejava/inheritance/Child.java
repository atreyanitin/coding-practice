package com.corejava.inheritance;

public class Child extends Parent {
	public Child(){
		System.out.println("Child");
		
	}
	
	public void print() throws InterruptedException{
		System.out.println("I am Child");
	}
	
	public void print(String value) {
		System.out.println(value);
	}
	
	public int print(String value, int i) {
		return -1;
	}

}

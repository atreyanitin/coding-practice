package com.java8features.defaults;

public interface Father {
	
	public String name();
	
	default public void me() {
		System.out.println("I am Father!!!!");
	}
	
	default public void me2() {
		System.out.println("I am Father me2!!!!");
	}
	
	public static void imStatic() {
		System.out.println("I am static");
	}

}

package com.java8features.defaults;

public interface Mother {
	
	default public void me() {
		System.out.println("I am Mother");
	}

}

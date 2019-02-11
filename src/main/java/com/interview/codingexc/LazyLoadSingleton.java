package com.interview.codingexc;

public class LazyLoadSingleton {
	
	private static class HOLDER {
		static final LazyLoadSingleton instance = new LazyLoadSingleton();
	}

	private LazyLoadSingleton(){}
	
	public static LazyLoadSingleton getInstance(){
		return HOLDER.instance;
	}
	
}

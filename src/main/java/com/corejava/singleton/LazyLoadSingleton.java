package com.corejava.singleton;

public class LazyLoadSingleton {

	private static class HOLDER {
		private static LazyLoadSingleton instance = new LazyLoadSingleton();
	}
	
	private LazyLoadSingleton() {
	}
	
	public static LazyLoadSingleton getInstance() {
		return HOLDER.instance;
	}

}

package com.corejava.singleton;

public class DoubleCheckLockSingleton {

	private static volatile DoubleCheckLockSingleton instance;

	private DoubleCheckLockSingleton() {

	}

	public static DoubleCheckLockSingleton getInstance() {
		if (instance == null) {
			synchronized(DoubleCheckLockSingleton.class) {
				if(instance == null)
					instance = new DoubleCheckLockSingleton();
			}
		}
		return instance;
	}

}

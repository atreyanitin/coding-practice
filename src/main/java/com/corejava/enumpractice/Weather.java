package com.corejava.enumpractice;

public enum Weather {
	
	HOT(1),
	COLD(2),
	WARM(3);
	
	private int value;
	
	private Weather(int i) {
		this.value = i;
	}
	
	public String toString() {
		return String.valueOf(value);
	}

}

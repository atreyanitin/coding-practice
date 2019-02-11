package com.corejava.threads;

import java.util.Random;

class Producer {
	public int produce() {
		return new Random().nextInt();
	}
}

class Consumer{
	public void consume() {
		
	}
}

class Bucket {
	private int item;
	
	public int getItem() {
		return item;
	}
	
	public void setItem(int i) {
		item = i;
	}
}
public class ProConApp {
	
	
	
	public static void main(String args[]) {
		Bucket bucket = new Bucket();
	}

}

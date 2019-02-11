package com.algo.general;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static int findMiddle(LinkedList<Integer> l) {
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		LinkedList<Integer> l = new LinkedList<>();
		for(int i=1; i<20;i++) {
			l.add(i);
		}
		
		
		System.out.println(findMiddle(l));
		
	}

}

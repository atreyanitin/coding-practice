package com.practice.algo;

public class LinkedListReverse {
	
	static class Node {
		int value;
		Node next;
		Node(int x) {
			value = x;
		}
	}
	
	public static Node reverse(Node head) {
		if(head.next == null) {
			return head;
		}
		
		Node first = reverse(head.next);
		
		return first;
		
	}
	
	public static void main(String args[]) {
		
		LinkedListReverse ll = new LinkedListReverse();
		
		Node node = new Node(1);
		
	}

}

package com.algo.general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LLDetectLoop {

	public Node head;

	class Node {
		int data;
		Node next;

		public Node(int d, Node n) {
			this.next = n;
			this.data = d;
		}
	}

	public void push(int n) {
		Node newNode = new Node(n, null);
		newNode.next = head;
		head  = newNode;
	}

	public static boolean detectLook(LLDetectLoop ll) {
		
		HashSet<Integer> record = new HashSet<Integer>();
		Node pointer = ll.head;
		
		while(pointer.next !=null) {
			if(record.contains(pointer.data)) {
				return true;
			}
			record.add(pointer.data);
			pointer = pointer.next;
		}
		
		return false;
	}
	
	 boolean detectLoop()
	    {
	        Node slow_p = head, fast_p = head;
	        while (slow_p != null && fast_p != null && fast_p.next != null) {
	            slow_p = slow_p.next;
	            fast_p = fast_p.next.next;
	            if (slow_p == fast_p) {
	                System.out.println("Found loop");
	                return true;
	            }
	        }
	        return false;
	    }
	
	public static void main(String args[]) {
		// 4-3-2-1
		LLDetectLoop linkedList = new LLDetectLoop();
		linkedList.push(4);
		linkedList.push(3);
		linkedList.push(2);
		linkedList.push(1);
		Node n1 = linkedList.head.next.next.next.next;
		
		Node n2 = linkedList.head.next;
		
		
		//linkedList.head.next.next.next.next = linkedList.head.next;
		
		System.out.println("Loop Detected?????? " + detectLook(linkedList));
		
		System.out.println("Loop Detected?????? " + linkedList.detectLoop());
		
		
		
		
		
		
	}

}

package com.corejava.threads;

import java.util.*;
/*
Requirement :  t1->t2->t3->t4>->t5
*/
public class SeqThreads {

  private static class PrintThread extends Thread {
	private final int num;
	private PrintThread t;

	public PrintThread(final int n , PrintThread l) {
		this.num = n;
		this.t = l;
	}

	public void run() {
		if(t !=null) {
				try{
					t.join();
				}catch(Exception e) {
				}
			}
		System.out.println("Number is : "+ num);
	}
  }

  public static void main(String args[]) {

  	PrintThread t1 = new PrintThread(1,null);
  	PrintThread t2 = new PrintThread(2,t1);
  	PrintThread t3 = new PrintThread(3,t2);
  	PrintThread t4 = new PrintThread(4,t3);
  	PrintThread t5 = new PrintThread(5,t4);

 	t1.start();
  	t2.start();
  	t3.start();
  	t4.start();
  	t5.start();


  }
}
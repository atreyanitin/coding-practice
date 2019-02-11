package com.corejava.threads;

import java.util.*;
/*
Requirment : t5 should execute only when every other thread has finished
*/
public class SeqThreadsV2 {

  private static class PrintThread extends Thread {
	private final int num;
	private ArrayList<PrintThread> list;

	public PrintThread(final int n , ArrayList<PrintThread> l) {
		this.num = n;
		this.list = l;
	}

	public void run() {
		if(list.size() >0) {
			for(PrintThread t : list) {
				//System.out.println(Thread.currentThread() +" Joining "+ t);
				try{
					t.join();
				}catch(Exception e) {
				}
				//System.out.println(Thread.currentThread() +" Finished waiting on dependents ");
			}
		}

		System.out.println("Number is : "+ num);
	}
  }

  public static void main(String args[]) {

	ArrayList<PrintThread> joinToT1 = new ArrayList<PrintThread>();

  	PrintThread t1 = new PrintThread(1,joinToT1);
  	PrintThread t2 = new PrintThread(2,joinToT1);
  	PrintThread t3 = new PrintThread(3,joinToT1);
  	PrintThread t4 = new PrintThread(4,joinToT1);

    ArrayList<PrintThread> joinToT5 = new ArrayList<PrintThread>();
    joinToT5.add(t1);
    joinToT5.add(t2);
    joinToT5.add(t3);
    joinToT5.add(t4);
  	PrintThread t5 = new PrintThread(5,joinToT5);



 	t1.start();
  	t2.start();
  	t3.start();
  	t4.start();
  	t5.start();


  }
}
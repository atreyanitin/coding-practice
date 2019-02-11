package com.corejava.threads;

import java.util.*;
/*
Requirment : t1 and t2 should keep running sequentially
*/

public class SeqThreadsV3 {

  private static class PrintThread extends Thread {
	private final int num;
	private OrderMgr orderMgr;


	public PrintThread(final int n , OrderMgr o) {
		this.num = n;
		this.orderMgr = o;
	}

	public void run() {

		while(true) {
			synchronized(orderMgr) {
				if(orderMgr.getLastWriteBy() == num) {
					//System.out.println("I wrote last time so will skip");
					try{
						orderMgr.wait();
					}catch(Exception e) {
					}
				}
				else {
					System.out.println(num);
					orderMgr.setLastWriteBy(num);
					try{
						orderMgr.notify();
					}catch(Exception e) {
					}
				}
			}
		}


	}//end of run

  }//PrintThread

  private static class OrderMgr {
	  private int id;

	  void setLastWriteBy(int i) {
		  id = i;
	  }

	  int getLastWriteBy() {
		  return id;
	  }

  }

  public static void main(String args[]) {

	OrderMgr om = new OrderMgr();
	om.setLastWriteBy(2);

	PrintThread t1 = new PrintThread(1,om);
	PrintThread t2 = new PrintThread(2,om);

	t1.start();
	t2.start();


  }
}
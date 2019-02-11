package com.corejava.threads;
public class SeqThread {

  private static class PrintThread extends Thread {
	private final int num;

	public PrintThread(final int n) {
		this.num = n;
	}

	public void run() {
		System.out.println("Number is : "+ num);
	}
  }

  public static void main(String args[]) {

  	PrintThread t1 = new PrintThread(1);
  	PrintThread t2 = new PrintThread(2);
  	PrintThread t3 = new PrintThread(3);
  	PrintThread t4 = new PrintThread(4);
  	PrintThread t5 = new PrintThread(5);
 	t1.start();
  	t2.start();
  	t3.start();
  	t4.start();
  	t5.start();


  }
}
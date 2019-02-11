package com.corejava.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	
	
	
	
	static class RunAtLast extends Thread{
		CountDownLatch c;
		
		RunAtLast(CountDownLatch c){
			this.c = c;
		}
		public void run(){
			
			try {
				c.await();
				System.out.println("Aah I got a chance finally");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	static class RunAtBegining extends Thread{
		CountDownLatch c;
		
		RunAtBegining(CountDownLatch c){
			this.c = c;
		}
		public void run(){
			System.out.println("I am setting up things");
			try {
				Thread.sleep(1000);
				c.countDown();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String args[]){
		
		CountDownLatch c = new CountDownLatch(2);
		
		RunAtLast lastThread = new RunAtLast(c);
		RunAtBegining setupThread1 = new RunAtBegining(c);
		RunAtBegining setupThread2 = new RunAtBegining(c);
		
		lastThread.start();
		setupThread1.start();
		setupThread2.start();
		
	}

}

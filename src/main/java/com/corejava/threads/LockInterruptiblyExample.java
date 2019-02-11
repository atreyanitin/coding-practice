package com.corejava.threads;

import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptiblyExample {
	
	
	static class SampleThread extends Thread{
		ReentrantLock lock;
		
		SampleThread(ReentrantLock lock){
			this.lock=lock;
		}
		public void run(){
			try {
				System.out.println("I will try to acquire lock interruptibly");

				lock.lockInterruptibly();
				System.out.println("I actually Acquired the lock... :(  ");
			} catch (InterruptedException e) {
				System.out.println("Some one interrupted me");
				e.printStackTrace();
			}
		}
	}

	static class AnotherSampleThread extends Thread{
		ReentrantLock lock;
		Thread t;
		
		AnotherSampleThread(ReentrantLock lock, Thread t){
			this.lock=lock;
			this.t = t;
		}
		public void run(){
				lock.lock();
				System.out.println("Yeppiee I acquired Lock !!!!!");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("Station 1");
					e.printStackTrace();
				}
		}
	}
	
	
	public static void main(String args[]){
		ReentrantLock l = new ReentrantLock();
		SampleThread st = new SampleThread(l);
		AnotherSampleThread ast = new AnotherSampleThread(l, st);
		ast.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Station 2");
			e.printStackTrace();
		}
		st.start();
		st.interrupt();
	}
}

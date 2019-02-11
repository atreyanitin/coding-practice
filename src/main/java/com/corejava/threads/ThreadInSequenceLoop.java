package com.corejava.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadInSequenceLoop {
	static class PrinterThread implements Runnable{
		int id;
		
		PrinterThread(int i ) {
			id = i;
		}
		
		@Override
		public void run() {
				System.out.println(id);
			}
	}
	
	public static void main(String args[]) {
		ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
		
		PrinterThread t1 = new PrinterThread(1);
		PrinterThread t2 = new PrinterThread(2);
		PrinterThread t3 = new PrinterThread(3);
		PrinterThread t4 = new PrinterThread(4);
		
		s.scheduleWithFixedDelay(t1, 1, 1, TimeUnit.SECONDS);
		s.scheduleWithFixedDelay(t2, 1, 1, TimeUnit.SECONDS);
		s.scheduleWithFixedDelay(t3, 1, 1, TimeUnit.SECONDS);
		s.scheduleWithFixedDelay(t4, 1, 1, TimeUnit.SECONDS);
		
	}

}

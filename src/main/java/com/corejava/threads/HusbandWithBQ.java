package com.corejava.threads;

import java.util.*;
import java.util.concurrent.*;

public class HusbandWithBQ implements Runnable {

	private final static int WORK_FOR_A_WEEK = 1000;
	private BlockingQueue<String> wallet;
	private long startTime;
	private long endTime;

	public HusbandWithBQ(BlockingQueue<String> w, long st) {
		this.wallet = w;
		this.startTime = st;
	}

	private void shutDown() {
		Thread.currentThread().interrupt();
	}

	private boolean shouldTerminate() {
		System.out.println((System.currentTimeMillis() - startTime) + ": Time elapsed");
		if ((System.currentTimeMillis() - startTime) > 1000) {
			return true;
		} else
			return false;
	}

	private void earn() {
		while (!shouldTerminate()) {
			System.out.println(Thread.currentThread() + " HUSBAND: looping");
			synchronized (wallet) {
				try {
					wallet.put("1000");
					System.out.println(Thread.currentThread() + " added element and Size Becomes : " + wallet.size());
					Thread.sleep(400);
					if (wallet.size() == 10) {
						System.out.println(Thread.currentThread() + " Full. Waiting. Notifying consumer");
					}
					wallet.notifyAll();
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		}

		shutDown();

	}// end of earn

	public void run() {

		earn();

	}// end of run

}// end of class
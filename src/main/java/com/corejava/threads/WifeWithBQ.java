package com.corejava.threads;
import java.util.*;
import java.util.concurrent.*;

public class WifeWithBQ implements Runnable {

	private final static int WORK_FOR_A_WEEK = 1000;
	private  BlockingQueue<String> wallet ;
	private long startTime;
	private long endTime;


	public WifeWithBQ(BlockingQueue<String> w, long st){
		this.wallet = w;
		this.startTime = st;
	}

	private void shutDown() {
		Thread.currentThread().interrupt();
	}

	private boolean shouldTerminate() {
			System.out.println((System.currentTimeMillis()-startTime) +  ": Time elapsed");
			if((System.currentTimeMillis()-startTime)>1000){
				return true;
			}
			else return false;
	}

	private  void spend() {

		while(!shouldTerminate()) {
		System.out.println(Thread.currentThread()+" WIFE: looping");


				synchronized (wallet) {

					try{
						String s = wallet.take();
						System.out.println(Thread.currentThread()+" taken element > "+ s + "Size : " + wallet.size());

						Thread.sleep(200);
						if(wallet.size()==0) {
							System.out.println(Thread.currentThread()+" Items over. Going to notify producer");
						}
						wallet.notifyAll();
					}catch(InterruptedException ex) {
							System.out.println("Shutting Down");
							Thread.currentThread().interrupt();
					}
				}
		}
		shutDown();
	}//end of spend

	public void run() {

		spend();


	}//end of run


}//end of class
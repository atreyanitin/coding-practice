package com.corejava.threads;
import java.util.*;

public class Wife implements Runnable {

	private final static int WORK_FOR_A_WEEK = 1000;
	private  Wallet wallet ;


	public Wife(Wallet w){
		this.wallet = w;
	}

	private  void spend() {
		while(true) {
			wallet.less(1000);
			System.out.println("Current Time: "+System.currentTimeMillis());
			try{
				Thread.sleep(1200);
				}catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
		}
	}//end of spend

	public void run() {

		spend();

	}//end of run


}//end of class
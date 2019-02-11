package com.corejava.threads;
import java.util.*;

public class Husband implements Runnable {

	private final static int WORK_FOR_A_WEEK = 1000;
	private Wallet  wallet;


	public Husband(Wallet w){
		this.wallet = w;
	}

	private  void earn() {
			while(true) {
				wallet.add(1000);

				try{
					Thread.sleep(1000);
				}catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}

			}

	}//end of earn

	public void run() {

		earn();



	}//end of run


}//end of class
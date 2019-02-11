package com.corejava.threads;
public class Wallet {

	private int amount = 0;

	public synchronized void add(int a) {

		if(amount>=5000){
			try{
				System.out.println("HUSBAND: AMOUNT GOOD ENOUGH"+ " By " + Thread.currentThread());
				wait();
			}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
			}
		}
		else {

			amount +=a;
			System.out.println("HUSBAND: added 1000 so amount = "+amount+ " By " + Thread.currentThread());
			notify();
		}
	}

	public synchronized void less(int a) {
		if(amount<1000){
			try{
				System.out.println("WIFE: Amount not enough so waiting " + amount+ " By " + Thread.currentThread());
				wait();
			}catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		else{
			System.out.println("WIFE:Before Shopping amount = "+amount+ " By " + Thread.currentThread());
			amount -=a;
			System.out.println("WIFE:Shopping done. amount = "+amount + " By " + Thread.currentThread());
			notify();
		}
	}

	public synchronized int getBalance() {
		return amount;
	}

}



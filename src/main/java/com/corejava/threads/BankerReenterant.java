package com.corejava.threads;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;

/*
Demonstrate Deadlock solution thru Reenterant

*/

public class BankerReenterant{

	private static class Account {
		int amount = 0;
		public Lock lock = new ReentrantLock();

		Account(int a) {
			amount = a;
		}

		void addFund(int money) {
			amount +=money;
		}

		int checkBalance() {
			return amount;
		}

		void withdraw(int a) {
			amount -=a;
		}
	}//end of Account

	public void transfer(Account fromAcc, Account toAcc, int amt) {

		System.out.println("Entered in Transfer >> "+ Thread.currentThread());
		try{
			if(fromAcc.lock.tryLock(1, TimeUnit.SECONDS)) {

				System.out.println("Acquired 1st Lock >> "+ Thread.currentThread());
				if(toAcc.lock.tryLock()) {
					try{
						System.out.println("Acquired 2nd Lock >> "+ Thread.currentThread());

						if(fromAcc.checkBalance()>amt){
							System.out.println("Enough fund so no prob >> "+ fromAcc.checkBalance() +" " + Thread.currentThread());
							fromAcc.withdraw(amt);
							toAcc.addFund(amt);
						}
					}finally{
							toAcc.lock.unlock();
					}
				} //end of 2nd if
			  }//end of 1st if
			}catch(Exception e) {
			}finally{
				fromAcc.lock.unlock();
			}

	}//end of Transfer


	private static class Client extends Thread {

		BankerReenterant banker;
		Account fromAcc;
		Account toAcc;

		Client(BankerReenterant b, Account acc1, Account acc2) {
			this.banker = b;
			this.fromAcc = acc1;
			this.toAcc = acc2;
		}

		public void run() {
				banker.transfer(fromAcc, toAcc, 100);
		}

	}

	public static void main(String args[]) {

		Account acc1 = new Account(1000);
		Account acc2 = new Account(2000);
		BankerReenterant b = new BankerReenterant();

		System.out.println(acc1.checkBalance() + " >> acc1");
		System.out.println(acc2.checkBalance() + " >> acc1");

		Client c1 = new Client(b, acc1, acc2);
		Client c2 = new Client(b, acc2, acc1);

		c1.start();
		c2.start();

	}

}//end of Banker






package com.corejava.threads;
import java.util.*;
import java.util.concurrent.*;

public class HouseWithBlockingQueue {

	private BlockingQueue<String> walletBQ = new ArrayBlockingQueue<String>(10);
	private HusbandWithBQ nitin = new HusbandWithBQ(walletBQ,System.currentTimeMillis());
	private WifeWithBQ shruti = new WifeWithBQ(walletBQ,System.currentTimeMillis());

	public  void startLife() {
		new Thread(nitin).start();
		new Thread(shruti).start();//
		//new Thread(new HusbandWithBQ(walletBQ)).start();
		//new Thread(new WifeWithBQ(walletBQ)).start();
		//new Thread(new WifeWithBQ(walletBQ)).start();
	}

	public static void main(String args[]){

		new HouseWithBlockingQueue().startLife();

	}

}

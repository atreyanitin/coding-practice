package com.corejava.threads;
import java.util.*;
import java.lang.*;

public class NoVisibility {
	private static boolean ready = false;
	private static int number;

	private  static class ReaderThread extends Thread {
	public void run() {

		try{
				System.out.println("Enterint to sleep Reader> " + Thread.currentThread());
				Thread.sleep(1000);
		}catch(Exception e) {}

		while (!ready){
			System.out.println("Ready is not ready");
			Thread.yield();
		}

		System.out.println(Thread.currentThread() + " : "+number);
		}
	}


	public static void main(String[] args) {
		new ReaderThread().start();
		try{
			System.out.println("Enterint to sleep Main> " + Thread.currentThread());
			Thread.sleep(1100);
		}catch(Exception e) {}

		System.out.println(Thread.currentThread()+ " writing number and changing ready = true ");

		ready = true;
		System.out.println(Thread.currentThread()+ " writing after ready = true ");

		try{
			Thread.sleep(1100);
		}catch(Exception e) {}
		number = 42;
	}
}
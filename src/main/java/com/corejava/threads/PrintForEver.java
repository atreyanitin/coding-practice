package com.corejava.threads;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;

public class PrintForEver {
/* demonstrate thread interruption handling by ScheduledExecutorService which is scheduled to perform a
   command after certain fixed time to kill the printer.
*/


	static class Printer extends Thread {


		public void run() {
			System.out.println(this);
			while(!Thread.interrupted()) {
				System.out.println("Stop me else I will keep printing > "+Thread.currentThread());
				try{
					Thread.sleep(10);
				}catch(InterruptedException e) {
					interrupt();

				}
			}
		}

	}

	public static void main(String args[]) {

		final Printer pt = new Printer();

		pt.start();

		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

		ScheduledFuture<?> f = executor.schedule(new Runnable() {

				public void run() {
					System.out.println("Entered in executor to kill Printer >"+ Thread.currentThread());
					System.out.println("pt : " + pt);
					pt.interrupt();
				}

			},5,TimeUnit.SECONDS);
		



	}


}
package com.corejava.threads;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;


public class PrintForEver2 {
/* demostrate thread interrution handling by Future which is scheduled to perform a
   command after certain fixed time to kill the printer.
*/


	static class Printer implements Callable<Boolean> {
		private boolean cancel;

		public void cancel(boolean f) {
			cancel = f;
		}

		public Boolean call() {
			System.out.println(this);
			while(!cancel) {
				System.out.println("Stop me else I will keep printing > "+Thread.currentThread());
				try{
					Thread.sleep(10);
				}catch(InterruptedException e) {}
			}
			return true;
		}

	}

	public static void main(String args[]) {

		final Printer pt = new Printer();

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future f = executor.submit(pt);

		try {
			f.get(5, TimeUnit.SECONDS);
		}catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("Interrupted exiting");

		}finally {
			pt.cancel(true); // interrupt if running
		}
	}


}
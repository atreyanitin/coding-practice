package com.corejava.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureExample {

	public static void main(String args[]) {
		ExecutorService service = Executors.newCachedThreadPool();
		List<Future> resultFutureList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			resultFutureList.add(service.submit(new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					System.out.println(Thread.currentThread() + " <<<< Executed successfully");
					return true;
				}
			}));

		}

		for (int i = 0; i < 2; i++) {

			resultFutureList.add(service.submit(new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					System.out.println(Thread.currentThread() + " <<<< Executed successfully");
					return false;
				}
			}));

		}
		
		for (Future f : resultFutureList) {
			try {
				if (((Boolean) f.get()).booleanValue() == false) {
					System.out.println(" I failed ");
				}
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}

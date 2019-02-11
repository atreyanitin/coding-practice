package com.corejava.threads;
import java.util.concurrent.*;

public class TestExecutor{


	public static void main(String args[]) {

		ScheduledExecutorService stse = Executors.newSingleThreadScheduledExecutor();

		Runnable task = new Runnable(){
					public void run() {
						System.out.println("I am running task");
					}
				};

		stse.scheduleAtFixedRate(task,1000,1000,TimeUnit.MILLISECONDS);

	}

}
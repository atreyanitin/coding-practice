package com.corejava.threads;
import java.util.*;
import java.util.concurrent.*;


public class MailRoom {

	private BlockingQueue<String> mailbox = new ArrayBlockingQueue<String>(1);
	MailReader mr = new MailReader(mailbox);
	MailCarrier mc  = new MailCarrier(mailbox);


	public  void startMailService() {

		ScheduledExecutorService stse = Executors.newSingleThreadScheduledExecutor();//

		//new Thread(mc).start();
		stse.scheduleAtFixedRate(mc,1000,500,TimeUnit.MILLISECONDS);
		stse.scheduleAtFixedRate(mr,1000,600,TimeUnit.MILLISECONDS);
		//stse.scheduleAtFixedRate(new MailReader(mailbox),1000,500,TimeUnit.MILLISECONDS);

	}

	public static void main(String args[]) {
		new MailRoom().startMailService();

	}


}
package com.corejava.threads;
import java.util.*;
import java.util.concurrent.*;

public class MailCarrier implements Runnable{
	private BlockingQueue<String> mailbox;

	public MailCarrier(BlockingQueue<String> m) {
		this.mailbox = m;
	}

	private void deliver() {

		System.out.println(Thread.currentThread()+ " : Starting delivering mails");
		try{
			synchronized(mailbox) {
				if(mailbox.remainingCapacity()==0){
					System.out.println("size full "+ Thread.currentThread());
					Thread.sleep(100);

				}
				mailbox.put("new Mail");
				System.out.println("Mail Delivered. Mailbox size is: "+mailbox.size()+" : By "+ Thread.currentThread());
	        	mailbox.notify();
			}
		}catch(Exception e) {
			System.out.println("Inturrepted : "+ e);
		}
	}


	public void run() {
		deliver();
	}

}
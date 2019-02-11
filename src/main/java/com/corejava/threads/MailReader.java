package com.corejava.threads;
import java.util.*;
import java.util.concurrent.*;

public class MailReader implements Runnable {

	private BlockingQueue<String> mailbox;

	public MailReader(BlockingQueue<String> m) {
		this.mailbox = m;
	}

	private void read() {
		System.out.println(Thread.currentThread()+ " : Starting reading mails");
		try{
		//	synchronized(mailbox){
				if(mailbox.size()==0){
					System.out.println("size empty "+ Thread.currentThread());
					Thread.sleep(100);

				}
				mailbox.take();
				System.out.println("Mail Read. Remaining Mails: "+mailbox.size()+" : By "+ Thread.currentThread());
		//		mailbox.notify();
		//	}


		}catch(Exception e) {
			System.out.println("Inturrepted : "+ e);
		}
	}

	public void run() {

			read();



	}

}
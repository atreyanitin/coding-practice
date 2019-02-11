 package com.interview.codingexc;

public class ThreadLocalTest {
	public static final ThreadLocal<String> tl = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return "ThreadLocalValue"
					;
		}
	};


	public static void main(String args[]) {

		Thread mt1 = new Thread(){
			@Override
			public void run() {
				System.out.println("My Threadlocal Value is  : "+Thread.currentThread()+ ": " + tl.get());
				tl.set("Modified By"+ Thread.currentThread());
				System.out.println("My Threadlocal Value is  : "+Thread.currentThread()+ ": " + tl.get());
			}
				
		};
		Thread mt2 = new Thread(){
			@Override
			public void run() {
				System.out.println("My Threadlocal Value is  : "+Thread.currentThread()+ ": " + tl.get());
				tl.set("Modified By"+ Thread.currentThread());
				System.out.println("My Threadlocal Value is  : "+Thread.currentThread()+ ": " + tl.get());
			}
				
		};

		mt1.start();
		mt2.start();
	}

}

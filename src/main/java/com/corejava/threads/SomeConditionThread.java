package com.corejava.threads;

public class SomeConditionThread {
	public static boolean stop;

	class SampleThread extends Thread {

		public void run() {
			System.out.println("Sample Thread Executing");
		}
	}

	public static void main(String args[]) {

		while (!stop()) {
			System.out.println("Do Something");
		}

		System.out.println("Do Nothing");

	}

	public static void setStop(boolean st) {
		stop = st;
	}

	public static boolean someCondition() {
		return false;
	}

	public static boolean stop() {
		return stop;
	}
}

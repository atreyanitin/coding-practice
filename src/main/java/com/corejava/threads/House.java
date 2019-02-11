package com.corejava.threads;
import java.util.*;

public class House {

	private Wallet wallet = new Wallet();
	private Husband nitin = new Husband(wallet);
	private Wife shruti = new Wife(wallet);

	public  void startLife() {
		new Thread(nitin).start();
		new Thread(shruti).start();//
		new Thread(new Husband(wallet)).start();
		new Thread(new Wife(wallet)).start();
		new Thread(new Wife(wallet)).start();

	}

	public static void main(String args[]){

		new House().startLife();

	}


}
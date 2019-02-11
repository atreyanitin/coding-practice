package com.corejava.inheritance;

import java.io.FileNotFoundException;

public class MainModule {
	
	public static void main(String args[]){
		
		MainModule m = new MainModule();
		
	/*	Parent p1 = new Parent();
		
		Parent p2 = new Child();
		
		p1.print();
		p2.print();
		*/
		
		m.tryCatch();
		
	   // p2.print("Test") //would not compile
		
	}
	
	public void tryCatch() {
		int i = 5;
		try {
			if(i ==5) 
				throw new FileNotFoundException();
			else 
				System.out.println(4);
		} catch (FileNotFoundException e) {
			System.out.println(7);
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException e1) {
				System.out.println(10);
			}
		}
		
		finally {
				System.out.println(9);		
		}
	}

}

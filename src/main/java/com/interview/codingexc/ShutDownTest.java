package com.interview.codingexc;

public class ShutDownTest {
	
	public static void main(String args[]){
		try{
			System.out.println("In side try");
			throw new ClassNotFoundException();
		}catch(Exception ex){
			System.out.println("In side catch");
			Runtime.getRuntime().addShutdownHook(new Thread(){
				public void run(){
					System.out.println("I am a shutdown hook");
				}
			});
			System.exit(1);
		}finally{
			System.out.println("In side finally");
		}
	}

}

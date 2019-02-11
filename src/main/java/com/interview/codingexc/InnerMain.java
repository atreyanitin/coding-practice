package com.interview.codingexc;

public class InnerMain {
	
	static int counter = 20;
	
	class InnerClass{
		int innerCount = 10;
		public int getInnerCount(){
			return innerCount;
		}
		public int getOuterCount(){
			return counter;
		}
	}
	
	
	static class StaticInnerClass{
		int innerCount = 15;
		public int getInnerCount(){
			return innerCount;
		}
		public int getOuterCount(){
			return counter;
		}
	}
	
	
	public static void main(String args[]){
		System.out.println("General Inner Class getInnerCount: "+new InnerMain().new InnerClass().getInnerCount());
		System.out.println("General Inner Class getOuterCount: "+new InnerMain().new InnerClass().getOuterCount());
		
		System.out.println("Nested Inner Class getInnerCount: "+new InnerMain.StaticInnerClass().getInnerCount());
		System.out.println("Nested Inner Class getOuterCount: "+new InnerMain.StaticInnerClass().getOuterCount());
	
		/*
		InnerMain im = new InnerMain();
		InnerMain.InnerClass iim = im.new InnerClass();
		StaticInnerClass sic = new InnerMain.StaticInnerClass();
		*/
		
	}

}

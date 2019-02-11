package com.interview.codingexc;

public class ConstructorTest {
	 static String str = "Field";
	
	static {
	 	str = "Static";
	 	String str2 = "";
	}
	
	public ConstructorTest(Object o){
		System.out.println(o + " from Object");
		
	}
	
	public ConstructorTest(String o){
		System.out.println(o + " from String" );
		str = "Constructor";
	}
	public void print(){
		System.out.println(str);
	}
	
	public static void main(String args[]){
		new ConstructorTest("Hello").print(); 
		//ConstructorTest.str2 is not visible, because of enclosing braces
	}
}

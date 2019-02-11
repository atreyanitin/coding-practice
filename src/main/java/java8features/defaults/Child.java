package java8features.defaults;

import java.util.HashMap;

public class Child implements Father, Mother {
	

	@Override
	public String name() {
		return "Child";
	}
	
	@Override
	public void me() {
		Father.super.me();
	}

	public static void imStatic() {
		System.out.println("I am static child");
	}

	public static void main(String args[]) {
		Child c = new Child();
		c.me();
		c.me2();
		Father.imStatic();
		Child.imStatic();
		
		new HashMap().put(c,null);
	}

}

package com.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericPutGet {


	public void addMethod(List<? super Child> argList) {

		argList.add(new Child());


	}

	public void getMethod(List<? extends Parent> prnt){

		for(Parent p : prnt) {
			System.out.println(p.name());

		}
	}

	public static void main (String args[]) {

		GenericPutGet gpg = new GenericPutGet();

		List<? extends Number> ln = new ArrayList<Number>();

		//ln.add(1); //Compile time error. "extends" is another way to stop add function on list.
				//use super to compile it. <? super Number>


		//List<Parent> p2 = new ArrayList<Child>(); -> Incompatible types. Compiler-error

		List<Child> p2 = new ArrayList<Child>(); // Compiles fine.
		gpg.addMethod(p2);
		p2.add(new GrandChild()); //Compiler error?
		p2.add(new Child()); //Compiles fine

		List<Parent> p3 = new ArrayList<Parent>(); // Compiles fine.
		gpg.addMethod(p3);

		gpg.getMethod(p2);
		
		//Following works
		 
		 List<Parent> oldList = new ArrayList<>();
		oldList.add(new Parent());
		oldList.add(new Child());
		
		System.out.println("hi"+oldList.get(0));
		System.out.println(oldList.get(1));
		
		List<Integer> i = new ArrayList<>();
		i.add(1);
		
		List<? super Number> n = new ArrayList<>();
		n.add(3.2);
		n.add(1);
	//	n = i;
		
		
		
		System.out.println("" + n.get(0) + n.get(1));

	}



}
package com.corejava.generics;

import java.util.*;

public class Test {


	public void avg(List<? extends Number> obj) {
		System.out.println("Entered in avg");
		double sum = 0.0;

		for(Object o: obj){

			if(o instanceof Integer) {
				sum = sum+((Integer)o).intValue();
			}
			if(o instanceof Double) {

				sum = sum+ ((Double)o).doubleValue();
			}
		}

		System.out.println("Avg is " + sum/obj.size());
	}


	public static void main (String args[]) {

		Test t = new Test();

		List<Number> numberList = new ArrayList<Number>();
		
	

		numberList.add(1);
		numberList.add(2.54);

		t.avg(numberList);

		List<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);

		List<String> s = new ArrayList<String>();
		s.add("Nitin");
		s.add("Shruti");

		t.avg(i);

	}



}
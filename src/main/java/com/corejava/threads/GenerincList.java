package com.corejava.threads;
import java.util.*;

public class GenerincList <T> {

	private ArrayList<T> l;

	public GenerincList(ArrayList<T> list) {
		this.l = list;
	}

	public void add(T e) {
		l.add(e);
	}

	public static void main(String argsp[]) {

		//GenericList<String> s = new GenericList<String>(new ArrayList<String>());

	}
}
package com.corejava.threads;
import java.util.*;

public class GenericList <T> {

	private ArrayList<T> l;

	public GenericList(ArrayList<T> list) {
		this.l = list;
	}

	public void add(T e) {
		l.add(e);
	}

	public static void main(String argsp[]) {

		//GenericList<String> s = new GenericList<String>(new ArrayList<String>());

	}
}
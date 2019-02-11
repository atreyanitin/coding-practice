package com.hackerrank.problems;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RansomLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}
		
		
		solve(magazine, ransom, m, n);
		
		
		
	}
	
	public static boolean solve(String[] mag, String[] ran, int m, int n) {
		
		final AtomicBoolean  yes_no = new AtomicBoolean(true);
		
		if(n>m) {
			return false;
		}
		if(m > 30000 || n > 30000) 
			return false;
		if(m<1 || n <1)
			return false;
		
		final HashMap<String, Integer> magzine = new HashMap<String, Integer>();
		
		Arrays.asList(mag).stream().forEach(s -> {
			if(!s.matches("[a-zA-Z]+"))
				yes_no.set(false);
			else if(!(s.length()<=5 && s.length() >=1)) {
				yes_no.set(false);
			}
			else magzine.put(s, magzine.get(s) ==null?1:magzine.get(s)+1);
		});
		
		Arrays.asList(ran).stream().forEachOrdered(s -> {
			
			if(!s.matches("[a-zA-Z]+")) {
				yes_no.set(false);
				
			}
			else if(!(s.length()<=5 && s.length() >=1)) {
				yes_no.set(false);
			}
			
			else if(!magzine.containsKey(s)) {
				yes_no.set(false);
			}
			else if(magzine.get(s) == null || magzine.get(s)<=0) {
				yes_no.set(false);
			}
			else magzine.put(s, magzine.get(s)-1);
		});
		
		return yes_no.get();
	}

}

package com.interview.codingexc;

import java.util.LinkedHashMap;

public class AnagramTest {

	
	public static boolean isAnagram(String testValue, String baseString) {
		boolean result = true;
		
		if(testValue == null || baseString == null || testValue.isEmpty() || baseString.isEmpty() || testValue.length() != baseString.length()) {
			return false;
		}
		
		char[] testValueArray = testValue.toCharArray();
		
		for(char c : testValueArray){
			int i = baseString.indexOf(c);
			if(i ==-1) {
				result = false;
			}
		}
		
		return result;
	}
	
	
	public static void main(String args[]){
		String s1 = "abc";
		String s2 = "bbb";
		String s3 = "bc";
		String s4 = "acc";
		String s5 = "cca";
		String s6 = "ca";
		
		

		System.out.println("s1 and s2 are anagram???? " +isAnagram(s2, s1));
		System.out.println("s1 and s3 are anagram???? " +isAnagram(s1, s3));
		System.out.println("s4 and s5 are anagram???? " +isAnagram(s4, s5));
		System.out.println("s5 and s6 are anagram???? " +isAnagram(s5, s6));
		
		/*LinkedHashMap<Character, Integer> map = countFrequency("abbcccdddd");
		for(Character c :map.keySet()) {
			System.out.println(c + " occurs : "+ map.get(c)+ " times");
			
		}
		
		String temp = "HelloWorld";
		char[] mychars = new char[5];
		
		temp.getChars(0, 5, mychars, 0);
		
		for(Character c : mychars){
			System.out.println(c + " : result");
		}
		
		System.out.println("Subsequence : "+ temp.subSequence(0, 5));
		
		temp = "Nitin, Shruti, Shivi, Ram";
		
		String[] result = temp.split(",",2);
		for(String s : result){
			System.out.println(s);
		}
		*/
	}
	
	public static LinkedHashMap<Character, Integer> countFrequency(String s){
		char[] chars = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(Character c : chars){
			Integer value = map.get(c);
			if(value==null) {
				value = new Integer(0);
			}
			map.put(c, new Integer(value.intValue()+1));
			
		}
		
		return map;
	}
	
}

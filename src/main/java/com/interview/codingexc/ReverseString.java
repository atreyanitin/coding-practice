package com.interview.codingexc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ReverseString {

	public static void main(String args[]) {
		String str = "MY NAME IS NITIN GOSWAMI";
		
		/*System.out.println("Reverse each Character  : " + recreverse(str));
		try {
			System.out.println("Reverse each Word  : " + wordCount(str));
			
			System.out.println(" Result : "+reverseRecursively(str)); 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		//System.out.println("Result : " + reverseRecurr(str));
		System.out.println("Reverse each Character  : " + recreverse(str));


	 
	/*
	List<Character> list = new ArrayList<>();
	list.add('z');
	list.add('z');list.add('c');list.add('b');list.add('z');list.add('c');list.add('h');list.add('f');
	list.add('i');list.add('h');list.add('i');list.add('e');
	List<Integer> i = lengthEachScene2(list);
	for(int z : i) {
		System.out.println(z);
	}*/
	
	}

	/*static List<Integer> lengthEachScene(List<Character> inputList)
	{
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		List<Character> processing = new ArrayList();
		int i = 0;
		for (; i < inputList.size();) {
			Character c = inputList.get(i);
			int last = inputList.lastIndexOf(c);

			while (i <= last) {
				processing.add(inputList.get(i));
				i++;
			}
			resultList.add(processing.size());
			processing.clear();

		}
		return resultList;
	}
	
	static List<Integer> lengthEachScene2(List<Character> inputList)
	{
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int i = 0;
		int lastIndex = -1;
		int subSize = 1;
		for (; i < inputList.size();) {

			Character c = inputList.get(i);
			int last = inputList.lastIndexOf(c);

			if (i == lastIndex) {
				resultList.add(subSize);
				lastIndex = i;
				subSize = 1;
				i++;
				continue;
			}

			if (lastIndex > 0 && last <= lastIndex) {
				i++;
				subSize++;
				continue;
			}

			if (last > lastIndex) {
				i++;
				lastIndex = last;
				subSize++;
				continue;
			}

		}
		return resultList;
	}*/
	
	public static String wordCount(String str) throws FileNotFoundException {
		File f = new File("C:\\Homework\\readfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader buffRead = new BufferedReader(fr);
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String inputLine = null;

		try {
			while ((inputLine = buffRead.readLine()) != null) {

				String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");
				for (int count = 0; count < words.length; count++) {
					String key = words[count].toLowerCase();
					if (key.length() > 0) {
						if (map.get(key) == null) {
							map.put(key, 1);
						} else {
							int value = map.get(key).intValue();
							map.put(key, value + 1);
						}
					}

				}
			}
		} catch (IOException e) {
		}
		return map.get(map.firstKey()).toString();

	}

	public static String reverseRecursively(String str) {

		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println("Coutn token: " + st.countTokens());

		while (st.hasMoreElements()) {
			String word = st.nextToken();
			sb.append(word + " ");
			System.out.println(word);
		}

		return sb.toString();
	}

	public static String recreverse(String str) {
		if (str.length() < 2) {
			return str;
		}

		return recreverse(str.substring(1)) + str.charAt(0);
	}
	
	public static String reverseRecurr(String str) {
		if(str.length() == 1) {
			return str;
		}
		return str.charAt(str.length()-1)+reverseRecurr(str.substring(0, str.length()-1));
		
	}

}

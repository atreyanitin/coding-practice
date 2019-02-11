package com.interview.codingexc;

public class RemoveCharFromString {

	public static String recercivelyRemove(String str, char unwanted) {
		int index = str.indexOf(unwanted);
		if (index == -1) {
			return str;
		}

		return recercivelyRemove(str.substring(0, index), unwanted)
				+ recercivelyRemove(str.substring(index + 1, str.length()), unwanted);
	}

	public static void main(String args[]) {

		String str = "aaaaabaacaaa";
		char unwanted = 'a';
		System.out.println(recercivelyRemove(str, unwanted) + " : result");
		remove(str, unwanted);
	}

	public static void remove(String str, char unwanted) {
		StringBuffer res = new StringBuffer();
		String[] s = str.split("" + unwanted, str.length());
		for (String a : s) {
			res.append(a);
		}
		System.out.println(res);

	}

}

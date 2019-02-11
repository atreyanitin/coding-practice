package com.companies.barclays.problem.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int solution(int N, String S) {

		if (S.length() == 0) {
			return N * 3;
		}

		if (S.length() > 1909) {
			S = S.substring(0, 1909);
		}

		String[] splitted = S.split("\\s+");

		final HashMap<Integer, String[]> seatMap = buildSeatMap(50);

		final ArrayList<String> availableForFamily = new ArrayList<String>();

		Set<String> reservedSeats = new HashSet<>(Arrays.asList(splitted));

		reservedSeats.forEach(str -> {

			// validate row number
			int rowNumber = Integer.parseInt(str.substring(0, str.length() - 1));

			char rowAlpha = str.charAt(str.length() - 1);

			String[] choices = seatMap.get(rowNumber) == null ? new String[] {} : seatMap.get(rowNumber);

			for (String choice : choices) {

				if (choice.length() == 4) {
					if (choice.indexOf(rowAlpha) == -1 || rowAlpha == 'D') {
						availableForFamily.add(choice.substring(1));
					} else if (rowAlpha == 'G') {
						availableForFamily.add(choice.substring(0, choice.length() - 1));
					}
				} else if (choice.length() == 3) {

					if (choice.indexOf(rowAlpha) <= -1) {
						availableForFamily.add(choice);
					}
				}
			}
			seatMap.remove(rowNumber);
		});

		return availableForFamily.size();
	}

	private static HashMap<Integer, String[]> buildSeatMap(int n) {
		HashMap<Integer, String[]> seatMap = new HashMap<>();

		while (n > 0) {
			seatMap.put(n, new String[] { "ABC", "DEFG", "HJK" });
			n--;
		}

		return seatMap;
	}

	public static void main(String args[]) {
		solution(1, "1A");

		/*
		 * System.out.println(Integer.parseInt("23333A".substring(0, "23333A".length() -
		 * 1))); System.out.println("222A".charAt("222A".length() - 1));
		 * System.out.println("DEFG".substring(0,"DEFG".length() - 1));
		 */

	}

}

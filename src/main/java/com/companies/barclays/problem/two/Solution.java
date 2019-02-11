package com.companies.barclays.problem.two;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

	public static String solution(int N, String S, String T) {

		StringTokenizer st = new StringTokenizer(S, ",");
		HashMap<Integer, String[]> shipTracker = new HashMap<>();
		String[] shipShots = T.split("\\s+");
		
		int i = 1;

		while (st.hasMoreTokens()) {
			String[] shipEdgeCells = st.nextToken().trim().split("\\s+");

			shipTracker.put(i++, shipEdgeCells);
			System.out.println("");
		}
		
		HashMap<Integer, HashMap<String, String>> finalMap = buildShipCells(shipTracker);
		
		for(String shot: shipShots) {
			finalMap.forEach((k,v)-> {
				if(v.containsKey(shot)) {
					v.put(shot, "X");
				}
			});
		}
		
		final AtomicInteger hitCounter = new AtomicInteger(0);
		final AtomicInteger sinkCounter = new AtomicInteger(0);
		
		finalMap.forEach((k,v) -> {
			final AtomicBoolean allShot = new AtomicBoolean(false);
			final AtomicBoolean someShot = new AtomicBoolean(false);
			final AtomicInteger check = new AtomicInteger(0);
			v.forEach((cell, status) -> {
				if(status.equals("X")) {
					someShot.set(true);
					check.incrementAndGet();
				} 
			});
			if(check.get() == v.size()) {
				sinkCounter.incrementAndGet();
				hitCounter.decrementAndGet();
			} 
			if(someShot.get() == true) {
				hitCounter.incrementAndGet();
			}
		});
		
		
		
		return ""+hitCounter.get()+","+sinkCounter.get();
	}

	private static HashMap<Integer, HashMap<String, String>> buildShipCells(HashMap<Integer, String[]> map) {
		HashMap<Integer, HashMap<String, String>> finalMap = new HashMap<Integer, HashMap<String, String>>();
		map.forEach((k, v) -> {

			String startCell = v[0]; 
			String endCell = v[1];

			int startRowId = Integer.parseInt(startCell.substring(0, startCell.length() - 1));
			char startColumnName = startCell.charAt(startCell.length() - 1);
			int endRowId = Integer.parseInt(endCell.substring(0, endCell.length() - 1));
			char endColumnName = endCell.charAt(endCell.length() - 1);
			HashMap<String, String> cellMap = new HashMap<>();

			for (int j =startRowId ; j <= endRowId ; j++) {
				for (int i = getAlphaIndex(startColumnName); i<= getAlphaIndex(endColumnName); i++) {
					System.out.println("" + j +getAlpha(i));
					cellMap.put(("" + j +getAlpha(i)), "");
					if(cellMap.size()>=4) {
						return;
					}
				}
			}
			finalMap.put(k, cellMap);

		});

		return finalMap;

	}
	
	private static String getAlpha(int n ) {
		String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return String.valueOf(all.charAt(n));
	}
	
	private static int getAlphaIndex(char n ) {
		String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return all.indexOf(n);
	}

	public static void main(String args[]) {
		//System.out.println(solution(3, "1A 1B,2C 2C", "1B"));
		System.out.println(solution(3, "1A 1B,2C 2C", "1B"));

	}
}

package com.interview.codingexc;

import java.util.Scanner;

public class JollyJumper {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		

		while (scan.hasNext()) {
			boolean[] diffFlags = new boolean[n];
			int[] numbers = new int[n];
			boolean isJolly = true;
			for (int i = 0; i < n; i++) {
				numbers[i] = scan.nextInt();
				diffFlags[i] = false;
			}

			for (int i = 0; i < n - 1; i++) {
				int diff = Math.abs(numbers[i] - numbers[i + 1]);
				if (diff > n || diff == 0 || diffFlags[i] == true) {
					System.out.println("Not Jolly Jumper");
					isJolly = false;
					break;
				} else {
					diffFlags[i] = true;
				}

			}
			if (isJolly) {
				System.out.println("Jolly Jumper");
			}

		}

	}
	

}

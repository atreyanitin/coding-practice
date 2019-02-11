package com.companies.salesforce.test;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author ngoswami
 *
 */
public class FindNumber {

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	static String findNumber(int[] arr, int k) {
		if(binarySearch(arr, k) >=0)
			return "YES";
		return "NO";

	}

	
	/**
	 * @param searchTerm
	 * @param items
	 * @return
	 */
	public static int binarySearch(int[] items, int searchTerm) {

		int first = 0, last = items.length - 1;
		int index = -1;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;
			if (items[mid] == searchTerm) {
				index = mid;
				return index;
			} else {
				if (searchTerm < items[mid]) {
					last = mid - 1;
				} else
					first = mid + 1;
			}
		}
		return index;
	}

	static int[] oddNumbers(int l, int r) {
        int[] result = new int[r-l/2];
        int k = 0;
        for (int j = l; j <= r; j += 2) {
            System.out.print(j + " ");
            if (j+1 % 2 == 0) {
                 result[k++] = j;
            }
        }
		return result;
    }
	
	public static void main(String argsp[]) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		oddNumbers(2,5);

	}
}

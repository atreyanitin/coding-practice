package com.hackerrank.array;

import java.util.Scanner;

public class RotateArray {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	
    	 int []  resultArray = new int[n];
    	
    	 for(int i = 0 ;i < n ; i++) {
    		 if(k == n) {
    			 k = 0;
    		 }
    		 resultArray[i] = a[k++];
    	 }
        
      return resultArray;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        a = new int[]{1,2,3,4,5};
        k = 4;
        n = 5;
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}

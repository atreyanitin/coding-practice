package com.algo.sort;

import java.util.Arrays;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ReverseArray {
	
	public static int[] reverse(int[] target) {
		
		for(int i=0,j=target.length-1; i<j; i++, j--){
			int temp = target[i];
			target[i] = target[j];
			target[j] = temp;
		}
		return target;
	}
	
	public static void main(String args[]){
		int[] ref = reverse(new int[]{1,2,3,4,5,6,7,8});
		Arrays.sort(ref);
		
		System.out.println("Search : "+ Arrays.binarySearch(ref, 12));
		
		for(int i : ref){
			System.out.println(i);
		}
	
		
	}

}

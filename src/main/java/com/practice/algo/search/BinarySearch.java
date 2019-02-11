package com.practice.algo.search;

public class BinarySearch {

	public static int binarySearch(int searchTerm, int[] items){
		
		int first = 0, last=items.length-1;
		int index = -1;
		int mid = 0;
		while(first<=last){
			mid = (first+last)/2;
			if(items[mid] == searchTerm){
				index = mid;
				return index;
			}
			else{
				if(searchTerm < items[mid]){
					last = mid-1;
				}
				else
					first = mid+1;
			}
		}
		return index;
		
	}
	
	public static void main(String args[]){
		int[] items = {1,2,3,4,5,6,7,8,9};
		int searchTerm = 9;
		
		int result = binarySearch(searchTerm, items);
		if(result ==-1){
			System.out.println("Item not found!!!");
		}
		else 
			System.out.println("Result: "+ items[result]+ " is at index = "+result);
	}
	
}

package com.algo.sort;

public class RevBubble {
	
	public static void main(String args[]){
		
	}
	
	public void Bubblesort(int[] sortme){
		
		int pavotIdx = 0;
		int pavotVal = sortme[pavotIdx];
		
		for(int i = 0; i < sortme.length ; i++){
			for(int j= 1; j< (sortme.length-i);j++){
				
			}
		}
		
		
	}
	
	public void QuickSort(int[] sortme, int low, int high) {
		
		int i = low;
		int j = high;
		int pov = sortme[(low+high)/2];
		int temp;
		
		while(i < j) {
			while(sortme[i]<pov){
				i++;
			}
			while(sortme[j] >pov){
				j--;
			}
			
			temp = sortme[j];
			sortme[j] = sortme[i];
			sortme[i]=temp;
			i++;
			j--;
			
			if(i < high)
				QuickSort(sortme,i,high); 
			
			if(j>low) 
				QuickSort(sortme, low, j);
			
			
		}
		
				
	}

}

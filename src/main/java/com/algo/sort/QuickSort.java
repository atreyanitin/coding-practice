package com.algo.sort;

public class QuickSort {

	/*
	 *  [3|1|2|4|5]
	 *   pivot = 2
	 *   
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/** Quick sort function **/
	public static void quickSort(int arr[], int low, int high) 
	{
		int i = low, j = high;
		int temp;
		int pivot = arr[(low + high) / 2];

		/** partition **/
		while (i <= j) 
		{
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) 
			{
				/** swap **/
				exchange(arr,i,j);

				i++;
				j--;
			}
		}
		System.out.println("j = "+ j);
		System.out.println("i = "+ i);

		/** recursively sort lower half **/
		if (low < j)
			quickSort(arr, low, j);
		/** recursively sort upper half **/
		if (i < high)
			quickSort(arr, i, high);

		for(int a=0; a< arr.length;a++)
			System.out.println(arr[a]);
	}

	public static int[] exchange(int[] sortMe, int left, int right){
		int temp = sortMe[right];
		sortMe[right] = sortMe[left];
		sortMe[left] = temp;
		return sortMe;
	}

	public static void main(String args[]){

		int[] sortMe = {3,2,5,1,4};

		QuickSort.quickSort(sortMe, 0, 4);




	}

}

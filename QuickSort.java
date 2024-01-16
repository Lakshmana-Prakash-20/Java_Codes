package com;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int arr[], int low, int high) {
		
		if(low>=high)
			return ;
		int start = low;
		int end = high;
		int mid= (start+end)/2;
		int pivot = arr[mid];
		
		while(start<= end) {
			
		while(arr[start]<pivot)
			start++;
		while(arr[end]>pivot)
			end--;
		if(start<=end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
//		quickSort(arr, low, end);
//		quickSort(arr, start, high);
	
	}
		quickSort(arr, low, end);
		quickSort(arr, start, high);
	}
	
	public static void main(String[] args) {
		
		 int a []= {558,-9,65,7,59,-66,85,-5,2,8,6,1,0,2,6,3,5};
		  quickSort(a, 0, a.length-1);
		 System.out.println(Arrays.toString(a));
		 
		
		
		
		
	}

}

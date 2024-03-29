package com;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] mergeSort(int arr[]) {
		
		if(arr.length==1)
			return arr;
		
		int mid = arr.length/2;
		
		int left[]= mergeSort(Arrays.copyOfRange(arr, 0,mid));
		int right [] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		
		return merge(left, right);
			
	}

	public static int[] merge(int [] left, int [] right) {
	
		int join[] = new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length &&  j<right.length) {
			if(left[i]<right[j])
				join[k++]=left[i++];
			else
				join[k++]= right[j++];
			}
		
		
			while(j<right.length)
				join[k++]= right[j++];
		 
			while(i<left.length)
				join[k++]= right[i++];
		
		
		return join;
		
}
	
	public static void main(String[] args) {
		int [] a= {8,5,0,6,1,4,5,9,3,96,5,5,97,5,66};
		a = mergeSort(a);
		System.out.println(Arrays.toString(a ));
		
	}
}
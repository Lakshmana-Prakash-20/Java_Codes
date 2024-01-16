package com;

import java.util.Arrays;
import java.util.Iterator;

//make all the even numbers to odd by adding 1 and odd numbers by subracting 1
public class OddToEvenToOdd {
	public static void main(String[] args) {
		int []a= {3,2,4,5,3,8,9,5,3,1,8,4,6};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				a[i]+=1;
			}
			else {
				a[i]-=1;
				
			}
	
		}
		System.out.println(Arrays.toString(a));
		
	}

}

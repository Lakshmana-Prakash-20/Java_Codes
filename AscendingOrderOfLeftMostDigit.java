package com;

import java.util.Arrays;
import java.util.TreeMap;

public class AscendingOrderOfLeftMostDigit {
	 static TreeMap<Integer, Integer> val = new TreeMap<Integer, Integer>();
	public static void main(String[] args) {
		int arr[]= {3,10,50,25,6,9,123};
	
	for (int i = 0; i < arr.length; i++) {
		
		remove(String.valueOf(arr[i]), arr[i]);
		
	}
	
	for (Integer i : val.values()) {
		System.out.println(i);
		
	}
		
		
				
	}
	public static void remove(String i, int a){
		if(i.length()>=2) {
			String c ="";
			c+=i.charAt(0);
			Integer s=Integer.parseInt(c);
			val.put(s, a);
//				System.out.println(s);
		}
		else {			
			String c ="";
			c+=i.charAt(0);
			Integer s=Integer.parseInt(c)*10;
		val.put(s*10, a);
//		System.out.print("     "+s);
			
		}
				
		
	}
	

}

package com;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Hii i am Prakash";
		String res ="";
		String arr []= s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) res +=  reverseString(arr[i])+" ";
			else res+=  arr[i]+" ";
			}
		System.out.println(res);
		}
	public static String reverseString(String s) {
		StringBuffer s1 = new StringBuffer(s);
		s1.reverse();
		return  new String(s1);
		}
	}

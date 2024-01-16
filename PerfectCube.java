package com;

import java.util.Scanner;

public class PerfectCube {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();
		int prod=1;
		for(int i =1; i<=num;i++) {
			prod=i*i*i;
			if(prod==num)
			{
				break;
			}
		}
		if(prod==num) {
			if(reverse(prod)) {
			System.out.println("the number is perfect  Cube and palindrome");
			}
			else {
				System.out.println("not a palindrome but perfect cube");
			}
		}
		else {
			System.out.println("not a perfect cube");
		}
	}
	
	public static boolean reverse(int num) {
		
		 String s = String.valueOf(num);
//		 System.out.println(s.getClass().getSimpleName());
		 StringBuilder s1 = new StringBuilder(s);
		 s1.reverse();
		 String res = new String(s1);
		if(s.equals(res)) 
			return true;
		else
			return false;
	
	}
}

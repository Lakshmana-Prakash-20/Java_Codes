package com;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the decimel value");//10
		long num = new Scanner(System.in).nextLong();
		String rev = "";
		int count = 0;
		if(num !=0) {
		while(num>0) {
			if(num%2==1) 
				count++;
		rev +=num%2; //010
		num = num/2; //1
		}}
		else {
			System.err.println("enter the valid number");
			System.exit(0);
		}
		StringBuffer sb = new StringBuffer(rev);
		sb.reverse();
	System.out.println("The binary to the corresponding decimel value is "+sb);
	System.out.println("The number of 1's present in the binary is "+count);
	
		}
}

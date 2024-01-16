package com;

public class LargestPalindrome {
	public static void main(String[] args) {
		int num=19;
		int last=0;
		int square;
		int sum=0;
		while(num>0) {
				last=num%10;
				square=last*last;
				sum=sum+square;
				if(sum==1) {
					System.out.println("hpy no");
				}
				num=num/10;
		}
//		System.out.println(num);
		System.out.println(sum);
	}
}

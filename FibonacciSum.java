package com;
//Sum of 10  fibonacci series starting from the position 
import java.util.Scanner;

public class FibonacciSum {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the starting position");
		int series =s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		for(int i =1; i<=series+10; i++) {
				 int temp = n1;
				n1 = n2;
				n2 = n2+temp;
				if(i>=series) {
					sum+= n2;
			}	
		}
		System.out.println(sum);
	
	}

}

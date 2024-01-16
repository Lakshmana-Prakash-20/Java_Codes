package com;

public class DivisionUsingRecursion {
	
	public static void main(String[] args) {

			int i=5;
			
			recurse(i);
	
		
	}

	public static void recurse(int num) {
	int i=2;
		if(num<=10) {
	System.out.println(num + " % " +i + " = "+ num/i);
		recurse(num+2);
	}
		
		
	}
}

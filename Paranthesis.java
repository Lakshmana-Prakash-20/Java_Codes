package com;

import java.util.Scanner;
//import java.util.Iterator;

public class Paranthesis {
	public static void main(String[] args) {
		int open =0, close =0;
		System.out.println("Enter the String");
		String s = new Scanner(System.in).next();
		char [] c =s.toCharArray();	
		for (int i =0; i<c.length; i++) {
			if(c[0]==')') {
				System.out.println("not a balanced paranthesis");
				break;
			}
			else if(c[i] == '(' || c[i]==')') {
				if(c[i] == '(') 
				open++;	
				else 
					close++;
				
				if(open == close && open!=0 && close!=0) {
					System.out.println("balanced paranthesis");
					break;
				}
				
				else {
					System.out.println("not a balanced paranthesis");
					break;
				}
	
				
			}
		}
		
	}

}

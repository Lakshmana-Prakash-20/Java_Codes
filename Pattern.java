package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("enter the string");
		String input =new Scanner(System.in).next();
		String s []=input.split("(?=[A-Z])");
	
		for(int i = 0; i<=s[0].length()||i<=s[1].length();i++) {
			
		System.out.println((removeCharacter(s[0], s[1], i)).toUpperCase());
			
		}
		
}
	public static String removeCharacter(String first, String last,int i) {
		String resultfirst="";
		String resultsecond="";
		if(first.length()>=i){
		for(int j =0; j<i;j++) {
		resultfirst+=first.charAt(j);	
		}
		}else {
			resultfirst=first;
		}
		if(last.length()>=i) {
		for (int j = 0; j <i; j++) {
			resultsecond+=last.charAt(j);
		}
		}else {
			resultsecond=last;
		}
		return (resultfirst+resultsecond);
	}
}

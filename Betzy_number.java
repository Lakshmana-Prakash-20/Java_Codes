package com;

import java.util.*;

public class Betzy_number {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();
		int rem=0;
		while(num>0) {
			rem =num%10;
			num /=10;
			a.add(rem);																																																																																																																																																																																																																					
		}
	
		for (int i = 0; i<a.size(); i++) {
			int k = 0;
			if((int)a.get(k) -(int)a.get(k++)== (int)a.get(k) -(int)a.get(k++)) {
				System.out.println("benzty number");
				break;
			}
			else {
				System.out.println("not a bentzy number");
				break;
			}
			
		}
	}

}

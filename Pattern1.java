package com;

public class Pattern1 {

	public static void main(String[] args) {
		int k =1;
		for (int i = 6; i <=9; i++) {
			k=1;
			for (int j = 1; j <= 9; j++) {

			
					
				
			 if(!(i+j<=10)&& !(i<=j)) {
			 
				 System.out.print(k+++" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
	}
}

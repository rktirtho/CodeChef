package com.diu.intracontest;

import java.util.Scanner;

public class DECIMALTOBINARY {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		
		while (testCase>0) {
			int decimalNumber = sc.nextInt();

			
			System.out.println(Integer.toBinaryString(decimalNumber));
			

			
			
			
			
			testCase--;

		}

	}

}

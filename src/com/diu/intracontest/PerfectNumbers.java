package com.diu.intracontest;

import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while (t>0) {
			int num= sc.nextInt();
			if(num==0) {
				System.out.println("NO");
			}
			else if (num%2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
			t--;
		}
	
	}

}

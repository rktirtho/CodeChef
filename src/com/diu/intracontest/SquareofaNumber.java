package com.diu.intracontest;

import java.util.Scanner;

public class SquareofaNumber {
	public static void main(String[] args) {
		int[] arr = new int[3];

		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		
		for (int i = 0; i < test; i++) {
			int n = scanner.nextInt();
			
			System.out.println((int) Math.pow(n,2));
		}

	}
}

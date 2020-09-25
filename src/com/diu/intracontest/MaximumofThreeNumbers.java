package com.diu.intracontest;

import java.util.Arrays;
import java.util.Scanner;

 class Codechef {
	public static void main(String[] args) {
		int[] arr = new int[3];

		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while (test > 0) {

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}

			Arrays.sort(arr);

			System.out.println(arr[2]);

			test--;

		}

	}
}
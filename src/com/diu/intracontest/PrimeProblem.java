package com.diu.intracontest;

import java.util.Scanner;

class PrimeProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int current = 0;
		int app = sc.nextInt();
		int maxCheck = 100000;

		for (i = 2; i <= maxCheck; i++) {
			if (CheckPrime(i)) {
				System.out.println(i);
				current++;
				if (current == app) {
					break;
				}
			}
		}

	}

	public static boolean CheckPrime(int n) {
		int remainder;
		for (int i = 2; i <= n / 2; i++) {
			remainder = n % i;

			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}

}
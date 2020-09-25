package com.diu.intracontest;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxofThreeNumbers {
	public static void main(String[] args) {
		int[] numbers = new int[3];

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		while (test > 0) {

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}

			Arrays.sort(numbers);

			System.out.println(numbers[1]);

			test--;

		}

	}

}

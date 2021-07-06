package com.skoti.learning;

import java.util.Arrays;

public class FindMultipleMissingNumbers {

	public static void main(String[] args) {
		int num[] = {3, 5, 7, 6, 8, 10};
		int maxNum = num.length + 1;
		findMultipleMissingNumber(num, maxNum);
	}

	private static void findMultipleMissingNumber(int[] num, int maxNum) {

		Arrays.sort(num);

		int count = 1;
		System.out.print("Missing numbers are: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] != count) {
				for (int j = count; j < num[i]; j++) {
					System.out.print(j + " ");
				}
			}
			count = num[i]+1;
		}

	}

}

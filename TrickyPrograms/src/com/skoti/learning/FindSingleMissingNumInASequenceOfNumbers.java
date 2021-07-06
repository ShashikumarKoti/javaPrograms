package com.skoti.learning;

import java.util.Arrays;

public class FindSingleMissingNumInASequenceOfNumbers {

	public static void main(String[] args) {
		//int num[] = { 1, 2, 3, 5, 7, 9, 6, 8, 10, 11 };
		int num[] = { 2, 1, 3, 7, 5, 9, 8, 6, 10, 11 };
		int maxNum = num.length+1;
		findMissingNumber(num, maxNum);
	}

	private static void findMissingNumber(int[] num, int maxNum) {
		Arrays.sort(num);  //optional
		int sumOfAllNumbers = 0;
		int currentSum = 0;

		sumOfAllNumbers = (maxNum * (maxNum + 1)) / 2;

		for (int i = 0; i < num.length; i++) {
			currentSum = currentSum + num[i];
		}

		System.out.println("Missing num is: " + (sumOfAllNumbers - currentSum));
	}

}

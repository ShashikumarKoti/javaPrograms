package com.skoti.learning;

public class MoveZerosAtEndOfArray {

	public static void main(String[] args) {

		int array_nums[] = { 0, 4, 1, 0, 3, 0, 5, 0, 6 };
		int count = 0;

		System.out.println("Originl array: ");
		for (int num : array_nums) {
			System.out.print(num + " ");
		}

		for (int i = 0; i <array_nums.length; i++) {
			if (array_nums[i] != 0) {
				array_nums[count] = array_nums[i];
				count++;
			}
		}
		while (count < array_nums.length) {
			array_nums[count] = 0;
			count++;
		}
		System.out.println("\nAfter moving 0's to end");
		for (int i = 0, size = array_nums.length; i < size; i++)
			System.out.print(array_nums[i] + " ");
	}

}

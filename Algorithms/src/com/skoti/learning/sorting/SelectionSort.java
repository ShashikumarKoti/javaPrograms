package com.skoti.learning.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		selectionSort(arr);
	}

	private static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			// min element
			int min_index = i;
			// Finding min element
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index])
					min_index = j;
			}

			// Swap the min element at min_index position
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			System.out.print("Iteration " + (i + 1) + ": ");
			printArray(arr);
		}
		return arr;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

//Note: Time Complexity: O(n2) as there are two nested loops.

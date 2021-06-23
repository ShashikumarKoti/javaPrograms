package com.skoti.learning.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		insertionSort(arr);
	}

	private static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
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

//Note: Time Complexity: O(n^2) 
//Worst Case Time Complexity [ Big-O ]: O(n2)

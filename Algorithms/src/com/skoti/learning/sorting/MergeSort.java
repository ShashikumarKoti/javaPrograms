package com.skoti.learning.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		mergeSort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (low < high) {
			// Find the middle point
			int middle = low + (high - low) / 2;
			mergeSort(arr, low, middle);
			mergeSort(arr, middle + 1, high);

			// Merge the sorted halves
			merge(arr, low, middle, high);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

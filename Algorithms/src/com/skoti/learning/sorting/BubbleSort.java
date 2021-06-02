package com.skoti.learning.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		bubbleSort(arr);
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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

//5 4 3 2 1
//In the first iteration, 5 will "bubble up to the surface," but the rest of the elements would stay in descending order. We would have to do one iteration for each element except 1, and then another iteration to check that everything is in order, so a total of 5 iterations.

//Expand this to any array of n elements, and that means you need to do n iterations. Looking at the code, that would mean that our while loop can run the maximum of n times.

//Each of those n times we're iterating through the whole array (for-loop in the code), meaning the worst case time complexity would be O(n^2).

//Note: The time complexity would always be O(n^2) if it weren't for the sorted boolean check, which terminates the algorithm if there aren't any swaps within the inner loop - which means that the array is sorted
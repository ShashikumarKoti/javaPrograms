package com.skoti.learning.trianglepatterns;

public class LeftPascalsTrianglePattern {

	private static final int row = 5;

	public static void main(String[] args) {
		for (int i = 0; i < row; i++) {
			// Print space in decreasing order
			for (int j = 2 * (row - i - 1); j > 0; j--) {
				System.out.print(" ");
			}
			// inner loop for columns
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 2 * (row - 4 + i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < row - i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

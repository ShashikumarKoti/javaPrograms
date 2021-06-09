package com.skoti.learning.trianglepatterns;

public class RightPascalsTrianglePattern {

	private static final int row = 5;

	public static void main(String[] args) {

		for (int i = 0; i < row; i++) {
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints stars
				System.out.print("* ");
			}
			// move to next line
			System.out.println();
		}
		for (int i = row-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

package com.skoti.learning.trianglepatterns;

public class TrianglePattern {

	private static final int row = 5;

	public static void main(String[] args) {
		for (int i = 1; i <= row; i++) {
			for (int j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == row || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

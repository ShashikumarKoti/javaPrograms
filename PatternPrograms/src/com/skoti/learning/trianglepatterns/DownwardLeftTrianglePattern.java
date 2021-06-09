package com.skoti.learning.trianglepatterns;

public class DownwardLeftTrianglePattern {

	private static final int row = 5;

	public static void main(String[] args) {
		for (int i = 0; i < row; i++) {
			for (int j = 2 * ((row - 1) - 4 + i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < row - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

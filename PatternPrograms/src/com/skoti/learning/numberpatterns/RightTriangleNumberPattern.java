package com.skoti.learning.numberpatterns;

public class RightTriangleNumberPattern {
	private static final int row = 5;

	public static void main(String[] args) {
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

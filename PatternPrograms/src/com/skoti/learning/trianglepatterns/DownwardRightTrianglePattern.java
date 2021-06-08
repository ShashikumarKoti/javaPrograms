package com.skoti.learning.trianglepatterns;

public class DownwardRightTrianglePattern {
	private static final int row = 5;

	public static void main(String[] args) {
		for (int i = row; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

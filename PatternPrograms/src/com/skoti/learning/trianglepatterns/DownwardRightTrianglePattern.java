package com.skoti.learning.trianglepatterns;

public class DownwardRightTrianglePattern {
	private static final int row = 5;

	public static void main(String[] args) {
		// Type-1
//		for (int i = row; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		// Type-2
		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

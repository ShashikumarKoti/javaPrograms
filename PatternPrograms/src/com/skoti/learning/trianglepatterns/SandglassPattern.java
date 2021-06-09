package com.skoti.learning.trianglepatterns;

public class SandglassPattern {

	private static final int row = 5;

	public static void main(String[] args) {
		//Type-1
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < row - i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < row; i++) {
//			// Print space in decreasing order
//			for (int j = row - i; j > 1; j--) {
//				System.out.print(" ");
//			}
//			// inner loop for columns
//			for (int k = 0; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// Type-2
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < row - i ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < row-1; i++) {
			// Print space in decreasing order
			for (int j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			// inner loop for columns
			for (int k = 0; k <= i+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

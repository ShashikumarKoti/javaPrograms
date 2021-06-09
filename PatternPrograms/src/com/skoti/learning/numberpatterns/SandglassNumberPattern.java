package com.skoti.learning.numberpatterns;

public class SandglassNumberPattern {

	private static final int row = 5;

	public static void main(String[] args) {
		int num=1;
		for (int i = 0; i < row; i++) {
				num=i+1;
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < row - i; k++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		for (int i = 0; i < row - 1; i++) {
			num = row-i-1;
			// Print space in decreasing order
			for (int j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			// inner loop for columns
			for (int k = 0; k <= i + 1; k++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}

}

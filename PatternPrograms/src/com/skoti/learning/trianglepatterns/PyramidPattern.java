package com.skoti.learning.trianglepatterns;

public class PyramidPattern {

	private static final int row = 5;

	public static void main(String[] args) {
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
		
		//Type-2
		for(int i=0;i<row;i++) {
			for(int j=0;j<2*(row-i-3)+i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

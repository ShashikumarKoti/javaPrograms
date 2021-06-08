package com.skoti.learning.trianglepatterns;

public class RightTrianglePattern {

	private static final int row = 5;

	public static void main(String[] args) {

		// i for rows and j for columns
		// row denotes the number of rows you want to print
		for (int i = 0; i < row; i++) {
			//inner loop for columns  
			for (int j = 0; j <= i; j++) {
				//prints stars   
				System.out.print("* ");
			}
			//move to next line
			System.out.println();
		}
	}
}

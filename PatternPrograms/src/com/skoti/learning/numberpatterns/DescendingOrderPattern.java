package com.skoti.learning.numberpatterns;

public class DescendingOrderPattern {
	private static final int row = 5;

	public static void main(String[] args) {
		int num = row;
		for (int i = 0; i < row; i++) {
			num = row;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println();
		}
	}
}

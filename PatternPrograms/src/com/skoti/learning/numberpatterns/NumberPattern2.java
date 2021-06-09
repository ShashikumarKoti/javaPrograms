package com.skoti.learning.numberpatterns;

public class NumberPattern2 {
	private static final int row = 5;

	public static void main(String[] args) {
		int num = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
			}
			num++;
			System.out.println();
		}
	}
}

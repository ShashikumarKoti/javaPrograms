package com.skoti.learning.alphabetpatterns;

public class K_ShapeAlphabetPattern2 {
	private static final int row = 5;

	public static void main(String[] args) {
		int alphabet = 65;
		for (int i = row; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}

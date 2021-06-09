package com.skoti.learning.alphabetpatterns;

public class TriangleAlphabetPattern {

	private static final int row = 5;

	public static void main(String[] args) {
		int alphabet = 65;
		for(int i=0;i<=row;i++) {
			alphabet = 65;
			for(int j=0;j<=2*(row-i-3)+i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((char)alphabet+ " ");
				alphabet++;
			}
			System.out.println();
		}
	}
}

package com.skoti.learning.numberpatterns;

public class ZerosOnesPattern {
	private static final int row = 5;

	public static void main(String[] args) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				if(j%2==0) {
				System.out.print(1 + " ");
				}else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

}

package com.skoti.learning.numberpatterns;

public class BinaryPattern {
	private static final int row = 5;

	public static void main(String[] args) {
		int num=0;
		for (int i = 0; i < row; i++) {
			if(i%2==0) {
				num=0;
				for(int j=0;j<row;j++) {
					System.out.print(num);
					num = (num==0)?1:0;
				}
			}
			else {
				num=1;
				for(int j=0;j<row;j++) {
					System.out.print(num);
					num = (num==1)?0:1;
				}
			}
			System.out.println();
		}
	}
}

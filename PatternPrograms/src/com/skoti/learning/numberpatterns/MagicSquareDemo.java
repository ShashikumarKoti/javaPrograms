package com.skoti.learning.numberpatterns;

public class MagicSquareDemo {

	public static void main(String[] args) {
		
		int[][] magicSquare = new int[3][3];
		
		magicSquare[0][0] = 8;
		magicSquare[0][1] = 1;
		magicSquare[0][2] = 6;
		magicSquare[1][0] = 3;
		magicSquare[1][1] = 5;
		magicSquare[1][2] = 7;
		magicSquare[2][0] = 4;
		magicSquare[2][1] = 9;
		magicSquare[2][2] = 2;
		
		//For rows
		int rowSum =0;
		for(int i=0;i<3;i++) {
			int sum =0;
			for(int j=0;j<3;j++) {
				sum = sum+ magicSquare[i][j];
			}
		//	System.out.println("From rows: "+ sum);
			rowSum = sum;
		}
		
		//For columns
		int columnSum = 0;
		for(int j=0;j<3;j++) {
			int sum =0;
			for(int i=0;i<3;i++) {
				sum = sum + magicSquare[i][j];
			}
		//	System.out.println("From columns:" + sum);
			columnSum = sum;
		}
		
		boolean isMagic= isMagicSquare(rowSum, columnSum);
		if(isMagic) {
			System.out.println("It is a magic square");
		}
		else {
			System.out.println("Not a magic square");
		}
		
	}
	
	static boolean isMagicSquare(int num1, int num2) {
		if(num1==num2) {
			return true;
		}else
			return false;
	}
}

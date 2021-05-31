package com.skoti.learning.strings;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		System.out.println("Please enter some text");
		Scanner reader = new Scanner(System.in);

		String nextLine = reader.nextLine();
		char[] charArray = nextLine.toCharArray();

		int count = 0;

		for (char c : charArray) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
			}
		}
		System.out.println("Number of vowels is: "+ count);
	}

}

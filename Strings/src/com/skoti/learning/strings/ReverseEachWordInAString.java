package com.skoti.learning.strings;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

		String reversedWord = reverseEachWord("Java Concept of the Day");
		System.out.println(reversedWord);
	}

	private static String reverseEachWord(String word) {
		String[] inputString = word.split(" ");

		String reverseString = "";

		for (int i = 0; i < inputString.length; i++) {
			char[] eachWordArray = inputString[i].toCharArray();
			String reverseWord = "";
			for (int j = eachWordArray.length - 1; j >= 0; j--) {
				reverseWord = reverseWord + eachWordArray[j];
			}
			reverseString = reverseString + reverseWord + " ";
		}
		return reverseString;
	}
}

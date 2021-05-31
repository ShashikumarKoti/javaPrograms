package com.skoti.learning.strings;

public class CountOccurencesOfCharacterWithoutLoop {

	public static void main(String[] args) {
		String word = "Java is java again java again";
		char wordToBeCounted = 'a';
		
		int count = word.length() - word.replace(String.valueOf(wordToBeCounted), "").length();
		System.out.println("Count of 'a' is :" + count);
	}

}

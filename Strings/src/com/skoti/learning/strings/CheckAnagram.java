package com.skoti.learning.strings;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String anagram = isAnagram("Mother In Law", "Hitler Woman");
		System.out.println(anagram);
	}

	private static String isAnagram(String word1, String word2) {
		
		//First remove all white spaces
		String str1 = word1.replaceAll("\\s", "");
		String str2 = word2.replaceAll("\\s", "");
		
		//Convert these string to char array
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		
		if(charArray1.length != charArray2.length) {
			return "Not an anagram";
		}
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean equals = Arrays.equals(charArray1, charArray2);
		
		if(equals) {
			return "Words are Anagram";
		}
		else {
			return "Not an anagram";
		}
	}
}

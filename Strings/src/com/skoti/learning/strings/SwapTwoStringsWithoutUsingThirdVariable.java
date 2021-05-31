package com.skoti.learning.strings;

public class SwapTwoStringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = "SPRINGBOOT";

		System.out.println("String-1: " + str1 + " and String-2: " + str2);

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());

		str1 = str1.substring(str2.length());

		System.out.println("String-1: " + str1 + " and String-2: " + str2);
	}
}

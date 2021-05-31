package com.skoti.learning.strings;

public class ReverseAString {

	public static void main(String[] args) {
	//	doStringReverse("OptimusPrime");
		doStringReverse("shashi kumar");
	}

	private static void doStringReverse(String string) {
		char[] charArray = string.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
}

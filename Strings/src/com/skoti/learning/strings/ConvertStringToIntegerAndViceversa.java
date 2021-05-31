package com.skoti.learning.strings;

public class ConvertStringToIntegerAndViceversa {

	public static void main(String[] args) {

		Integer convertStringToInteger = convertStringToInteger("2021");
		System.out.println("String to Integer is: " + convertStringToInteger);

		String convertIntegerToString = convertIntegerToString(2019);
		System.out.println("Integer to String is: " + convertIntegerToString);
	}

	private static String convertIntegerToString(int num) {
		// Type-1:
		String string = Integer.toString(num);
		
		//Type-2:
		String valueOf = String.valueOf(num);
	//	return string;
		return valueOf;
	}

	private static Integer convertStringToInteger(String string) {
		// Type-1:
		int parseInt = Integer.parseInt(string);

		// Type-2:
		Integer valueOf = Integer.valueOf(string);

		// return parseInt;
		return valueOf;
	}
}

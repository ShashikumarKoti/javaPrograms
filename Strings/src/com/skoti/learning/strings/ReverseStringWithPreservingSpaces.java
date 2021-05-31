package com.skoti.learning.strings;

public class ReverseStringWithPreservingSpaces {

	public static void main(String[] args) {

		reverseStringWithPreservingSpaces("I am not a String");
	}

	private static void reverseStringWithPreservingSpaces(String word) {

		char[] inputStringArray = word.toCharArray();
		
		char [] resultArray = new char[inputStringArray.length];
		
		//For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions
		for(int i=0;i<inputStringArray.length;i++) {
			if(inputStringArray[i]==' ') {
				resultArray[i]=' ';
			}
		}
		
		int j = resultArray.length-1;
		
		for(int i=0;i<inputStringArray.length;i++) {
			if(inputStringArray[i] != ' ') {
				if(resultArray[j]== ' ') {
					j--;
				}
				resultArray[j] = inputStringArray[i];
				j--;
			}
		}
		
		System.out.println(String.valueOf(resultArray));
	}
}

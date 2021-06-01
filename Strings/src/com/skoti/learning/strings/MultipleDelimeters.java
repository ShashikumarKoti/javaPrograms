package com.skoti.learning.strings;

public class MultipleDelimeters {

	public static void main(String[] args) {
		String str = "Sapnish... spanish the green spanish. I am spanish, java shashi";
		
		String newString = str.replaceAll("[^A-Za-z]+", " ");  //this regex keeps only alphabets in string and removes all other characters
		
		System.out.println(newString);

	}

}

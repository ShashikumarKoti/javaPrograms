package com.skoti.learning.strings;

public class ProveStringsAreImmutable {

	public static void main(String[] args) {
		
		//With literal
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		System.out.println(s1==s2);
		
		s1 = s1+"J2EE";   // a new object is created here
		System.out.println(s1==s2);
		
		//with new() 
		String str1 = new String("SpringBoot");
		System.out.println(str1);
		
		String concatedString = str1.concat("MicroServices");  //a new String object is created
		System.out.println(str1);  //This str1 is still unchanged after concatenating
		System.out.println(concatedString);
		
		
	}
}

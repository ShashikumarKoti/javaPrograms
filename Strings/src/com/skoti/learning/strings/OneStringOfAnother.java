package com.skoti.learning.strings;

public class OneStringOfAnother {

	public static void main(String[] args) {
		String str1 = "JavaJ2eeStrutsHibernate";
		String str2 = "StrutsHibernateJavaJ2ee";
		
	//below  are some rotated versions of this string.
	//“StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”.	

		boolean checkRotation = checkRotation(str1, str2);
		System.out.println(checkRotation);
	}

	private static boolean checkRotation(String str1, String str2) {
		String str3 = str1 + str1;
		
		if(str1.length()!= str2.length()) {
			return false;
		}
		if(str3.contains(str2)) {
			return true;
		}else {
		return false;
		}
	}
}

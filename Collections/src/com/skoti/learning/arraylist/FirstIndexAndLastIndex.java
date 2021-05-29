package com.skoti.learning.arraylist;

import java.util.ArrayList;

public class FirstIndexAndLastIndex {

	public static void main(String[] args) {
		//FirstIndex
//		 ArrayList<String> al = new ArrayList<String>();
//	      al.add("AB");
//	      al.add("CD");
//	      al.add("KL");
//	      al.add("EF");
//	      al.add("GH");
//	      al.add("IJ");
//	      al.add("KL");
//	      al.add("MN");
//
//	      System.out.println("Index of 'AB': "+al.indexOf("AB"));
//	      System.out.println("Index of 'KL': "+al.indexOf("KL"));  //"KL" is present at 2nd and 6th position. IndexOf always returns fist occurrence, hence '2' is returned
//	      System.out.println("Index of 'AA': "+al.indexOf("AA"));  //AA is not present, hence it returns -1.
//	      System.out.println("Index of 'EF': "+al.indexOf("EF"));
		
		//Last Index of returns last occurrence of the element
		ArrayList<Integer> al = new ArrayList<Integer>();
	      al.add(1);
	      al.add(88);
	      al.add(9);
	      al.add(17);
	      al.add(17);
	      al.add(9);
	      al.add(17);
	      al.add(91);
	      al.add(27);
	      al.add(1);
	      al.add(17);

	      System.out.println("Last occurrence of element 1: "+al.lastIndexOf(1));
	      System.out.println("Last occurrence of element 9: "+al.lastIndexOf(9));
	      System.out.println("Last occurrence of element 17: "+al.lastIndexOf(17));
	      System.out.println("Last occurrence of element 91: "+al.lastIndexOf(91));
	      System.out.println("Last occurrence of element 88: "+al.lastIndexOf(88)); 
	  }
}

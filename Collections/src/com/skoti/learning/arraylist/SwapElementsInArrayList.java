package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
	    al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");
	    
	    System.out.println("Befor swap: " + al);
	    
	    Collections.swap(al, 1,4);
	    System.out.println("After swap: "+ al);
	}

}

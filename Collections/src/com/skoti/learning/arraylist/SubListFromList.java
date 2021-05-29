package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SubListFromList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
	     al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");
	     
	 //    al.stream().forEach(System.out::println);
	     
	     //subList, Type-1
//	     List<String> subList = al.subList(2, 4);
//	     subList.stream().forEach(System.out::println);
	     
	     //sublist, Type-2
	     List<String> subLIst2 = new ArrayList<>(al.subList(2, 5));
	     subLIst2.stream().forEach(System.out::println);
	}

}

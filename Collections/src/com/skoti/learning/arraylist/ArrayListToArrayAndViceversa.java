package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArrayAndViceversa {

	public static void main(String[] args) {

		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");
		
		//converting List to array
		String[] stringArray = arrlist.toArray(new String[arrlist.size()]);
		for(String arrElement: stringArray) {
			System.out.println(arrElement);
		}
		
		//Converting array to List, Type-1
		List<String> asList = Arrays.asList(stringArray);
		System.out.println(asList);
		
		//Converting array to List, Type-2
		List<String> stringList = new ArrayList<>();
		Collections.addAll(stringList, stringArray);
		System.out.println(stringList);
	}

}

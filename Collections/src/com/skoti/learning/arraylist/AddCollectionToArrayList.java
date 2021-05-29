package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddCollectionToArrayList {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(44);
		list1.add(33);
		list1.add(77);
		list1.add(11);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(66);
		list2.add(88);
		list2.add(55);
		list2.add(22);
		
		
		//Adding list2(Collection) to list1
//		list1.addAll(list2);
//		list1.stream().forEach(System.out::println);
		
		
		//Adding list2(Collection) to list1 at specified location
		list1.addAll(2, list2);
		list1.stream().forEach(System.out::println);
		
	}

}

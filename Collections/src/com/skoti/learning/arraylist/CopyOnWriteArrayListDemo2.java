package com.skoti.learning.arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Ram");
		list.add("Arun");

		System.out.println("Without modification = " + list);

		Iterator<String> iterator1 = list.iterator();

		list.add("Mahesh");

		System.out.println("After modification = " + list);
		
		Iterator<String> iterator2 = list.iterator();
		
		list.add("ShreeKumar");
		
		System.out.println("After modifying second time = " + list);
		
		Iterator<String> iterator3 = list.iterator();
		
		System.out.println("Element from first Iterator:");
		iterator1.forEachRemaining(System.out::println);
		System.out.println("Element from Second Iterator:");
		iterator2.forEachRemaining(System.out::println);
		System.out.println("Element from Third Iterator:");
		iterator3.forEachRemaining(System.out::println);

	}

}

package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(44);
		list.add(33);
		list.add(77);
		list.add(11);
		list.add(66);
		list.add(88);
		list.add(55);
		list.add(22);
		
		//Case-1: Iterating through for loop
//		for(Integer num : list)
//		{
//			System.out.println("Num is:" + num);
//		}
		
		//Case-2: Traditional for loop
//		for(int i=0; i< list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//Case-3: using while loop
//		int counter = 0;
//		while(list.size()>counter) {
//			System.out.println(list.get(counter));
//			counter++;
//		}
//		int size = list.size();
//		System.out.println("List size is:"+ size);
		
		//Case-4: Iterating through iterator
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer num = (Integer)itr.next();
//			System.out.println("Num from iterator is: "+ num);
//		}
		
		//Case-4: through streams 
		//list.stream().forEach(System.out::println);
		
		
		//Case-6: While iterator is iterating, if list is modified by the 'list' reference, then ConcurrentModificationException is thrown
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer num = (Integer)itr.next();
//			if(num==66) {
//			list.remove(num);  //this throws ConcurrentModificationException
//			}
//		}
//		list.stream().forEach(System.out::println);
		
		//Case-7: While iterator is iterating, if list is modified by the 'iterator' reference, then NO Exception is thrown
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer num = (Integer)itr.next();
//			if(num==66) {
//			itr.remove();
//			}
//		}
//		list.stream().forEach(System.out::println);
		
		//Case-8: Sorting list 
//		Collections.sort(list);
//		list.stream().forEach(System.out::println);
		
		//Case-9: Reversing the list
//		Collections.reverse(list);
//		list.stream().forEach(System.out::println);
		
		//Case-10: Sort the list in ascending order and then reverse, Type-1
//		Collections.sort(list, Collections.reverseOrder());
//		list.stream().forEach(System.out::println);
//		
		//Case-11: Sort the list in ascending order and then reverse, Type-2
//		Collections.sort(list);
//		Collections.reverse(list);
//		list.stream().forEach(System.out::println);
		
	}

}

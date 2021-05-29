package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudListDemo {

	public static void main(String[] args) {
		
		//Using Comparable
		ArrayList<StudentListComparable> studList = new ArrayList<>();
		studList.add(new StudentListComparable(555, "Shashi", 31));
		studList.add(new StudentListComparable(222, "Amar", 30));
		studList.add(new StudentListComparable(777, "Jack", 29));
	
		Collections.sort(studList);
		studList.stream().forEach(System.out::println);
		
		
		//Using Comparator
//		ArrayList<StudentListComparator> studList = new ArrayList<>();
//		studList.add(new StudentListComparator(555, "Shashi", 31));
//		studList.add(new StudentListComparator(222, "Amar", 30));
//		studList.add(new StudentListComparator(777, "Jack", 29));
//		studList.add(new StudentListComparator(999, "Rose", 29));
		
		//using comparator by stud name
//		Collections.sort(studList, new StudNameComparator());
//		studList.stream().forEach(System.out::println);
		
		//using comparator by stud age, and if age is same, then compare by Stud Name
//		Collections.sort(studList, new StudAgeComparator());
//		studList.stream().forEach(System.out::println);
		
	}

}

package com.skoti.learning.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {

	public static void main(String[] args) {
		 HashSet<String> hset = new HashSet<String>();
	     hset.add("Element3");
	     hset.add("Element1");
	     hset.add("Element4");
	     hset.add("Element2");
	     
	     //Order not maintained in HashSet
	     System.out.println(hset);
	     
	     //Tree set will sort the elements
	     TreeSet<String> treeSet = new TreeSet<>(hset);
	     System.out.println(treeSet);
	     
	     
	     //List will maintain Insertion order
	     List<String> list = new ArrayList<>(hset);
	     System.out.println(list);
	}

}

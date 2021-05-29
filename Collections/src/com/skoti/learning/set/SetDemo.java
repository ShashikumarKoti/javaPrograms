package com.skoti.learning.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
	      HashSet<String> hset = new HashSet<String>();

	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      Iterator<String> itr = hset.iterator();
	      while(itr.hasNext()) {
	    	  System.out.print(itr.next()+ " ");
	      }
	      
	      System.out.println();
	      
	      //convert set to array
	      String[] array = hset.toArray(new String[hset.size()]);
	      for(String stringArray: array) {
	    	  System.out.print(stringArray+ " ");
	      }
	      
	      System.out.println();
	      //removing all elements from set
	      hset.clear();
	      System.out.println(hset);
	}

}

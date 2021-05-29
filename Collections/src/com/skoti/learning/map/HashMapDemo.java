package com.skoti.learning.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
	//	HashMap<Integer, String> hmap = new HashMap<Integer, String>();  //insertion order NOT maintained
	//	LinkedHashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();  //maintains insertion order
		TreeMap<Integer, String> hmap = new TreeMap<>();  //Sorts elements based on key
	      hmap.put(12, "Chaitanya"); 
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      
	      
	      //get key and values
	      Set<Entry<Integer, String>> entrySet = hmap.entrySet();
	      Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
	      while(iterator.hasNext()) {
	    	  Entry<Integer, String> elem = iterator.next();
	    	  System.out.println("Key is:" + elem.getKey() + " and value is "+ elem.getValue());
	      }
	      
	      System.out.println("=======values are==================");
	      //get values only
	      Collection<String> values = hmap.values();
	      values.stream().forEach(System.out::println);
	      
	      System.out.println("========keys are=================");
	      //get keys only
	      Set<Integer> keySet = hmap.keySet();
	      keySet.stream().forEach(System.out::println);

	      //removing all elements
	      hmap.clear();
	      
	      
	}

}

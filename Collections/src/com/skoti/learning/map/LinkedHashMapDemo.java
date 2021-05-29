package com.skoti.learning.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		 LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();  //Insertion order maintained with HashMap
         lhmap.put(22, "Abey");
         lhmap.put(33, "Dawn");
         lhmap.put(1, "Sherry");
         lhmap.put(2, "Karon");
         lhmap.put(100, "Jim");
         
         Set<Entry<Integer, String>> entrySet = lhmap.entrySet();
         System.out.println(entrySet);
	}

}

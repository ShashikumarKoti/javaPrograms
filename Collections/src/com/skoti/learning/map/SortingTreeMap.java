package com.skoti.learning.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortingTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> treemap = new TreeMap<>(new TreeMapComprator());
	    treemap.put("Key1", "Jack");
	    treemap.put("Key4", "Rick");
	    treemap.put("Key2", "Kate");
	    treemap.put("Key5", "Tom");
	    treemap.put("Key3", "Steve");
	    
	    Set<Entry<String, String>> entrySet = treemap.entrySet();
	    for(Map.Entry<String, String> entry : entrySet) {
	    	System.out.println("Key is:" + entry.getKey() + " and value is "+ entry.getValue());
	    }
	}
}

class TreeMapComprator implements Comparator<String> {

	@Override 
	public int compare(String str1, String str2) {  //Descending order based on Key
		return str2.compareTo(str1);
	}
}
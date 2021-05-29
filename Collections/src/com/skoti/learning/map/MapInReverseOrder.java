package com.skoti.learning.map;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInReverseOrder {

	public static void main(String[] args) {
		Map<String, String> treemap =  new TreeMap<String, String>(Collections.reverseOrder());  //reverse order

			    treemap.put("Key1", "Jack");
			    treemap.put("Key2", "Rick");
			    treemap.put("Key3", "Kate");
			    treemap.put("Key4", "Tom");
			    treemap.put("Key5", "Steve");
			    
			    Set<String> keySet = treemap.keySet();
			    System.out.println(keySet);
	}

}

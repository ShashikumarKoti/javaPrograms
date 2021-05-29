package com.skoti.learning.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> hMap = new HashMap<>();  //here comparison made on "equals()" method
		hMap.put("Shashi", "2379813");
		hMap.put(new String("Shashi"), "40008");
		System.out.println(hMap.size());
		
		//Identity HashMap
		Map<String, String> ihm = new IdentityHashMap<>(); //here comparison made on "=="(i.e, reference)
		ihm.put("Shashi", "2379813");
		ihm.put(new String("Shashi"), "40008");
		
		System.out.println(ihm.size());
	}

}

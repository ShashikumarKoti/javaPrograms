package com.skoti.learning.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		
		//This list stores only Keys
		Set<String> keySet = map.keySet();
		List<String> listOfKeys = new ArrayList<String>(keySet);
		System.out.println(listOfKeys);
		
		//This list stores only Values
		Collection<Integer> values = map.values();
		List<Integer> listOfValues = new ArrayList<Integer>(values);
		System.out.println(listOfValues);
		
		//Using java8, again stores only Keys
		List<String> listUsingJava8 = map.keySet().stream().collect(Collectors.toList());
		System.out.println(listUsingJava8);
		
		//This approach stores both keys and values
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> listOfMap = new ArrayList<>(entrySet);
		System.out.println(listOfMap);
		
		//Using java8, stores both keys and values
		List<Entry<String, Integer>> listOfMapUsingJava8 = map.entrySet().stream().collect(Collectors.toList());
		System.out.println(listOfMapUsingJava8);
	}
}

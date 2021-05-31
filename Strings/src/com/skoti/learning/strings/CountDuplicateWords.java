package com.skoti.learning.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateWords {

	public static void main(String[] args) {
		
		findDuplicateWords("Super Man and Bat man And Spider Man ");
	}

	private static void findDuplicateWords(String words) {
		String[] wordsArray = words.toLowerCase().split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String word : wordsArray) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Repeated word is "+ entry.getKey() + " and count is "+ entry.getValue());
			}
		}
	}

}

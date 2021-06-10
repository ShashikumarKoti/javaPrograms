package com.skoti.learning.strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RearrangeStringToFormPalindrome {

	public static void main(String[] args) {
		String word = "madmadsk";

		boolean checkIfAnagram = checkIfAnagram(word);
		if (checkIfAnagram) {
			System.out.println("Given word can form anagram");
		} else {
			System.out.println("Not an anagram");
		}
	}

	private static boolean checkIfAnagram(String word) {
		char[] charArray = word.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		int count = 0;
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		Collection<Integer> values = map.values();
		System.out.println("Vaues:" + values);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				count++;
			}
		}
		if (count > 1 || count==0) {
			return false;
		} else {
			return true;
		}
	}
}

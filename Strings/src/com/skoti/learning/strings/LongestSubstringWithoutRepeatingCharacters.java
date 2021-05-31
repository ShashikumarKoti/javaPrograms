package com.skoti.learning.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String findLongestSubString = findLongestSubString("javaconceptoftheDay");
		System.out.println(findLongestSubString);
	}

	private static String findLongestSubString(String string) {
		Map<Character, Integer> lhmap = new LinkedHashMap<>();
		String longestSubString = null;
		int longestSubStringLength = 0;

		char[] charArray = string.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!lhmap.containsKey(ch)) {
				lhmap.put(ch, i);
			} else {
				i = lhmap.get(ch);
				lhmap.clear();
			}
			
			if(lhmap.size() > longestSubStringLength) {
				longestSubStringLength = lhmap.size();
				longestSubString = lhmap.keySet().toString();
			}
		}
		return longestSubString;
	}
}

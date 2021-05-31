package com.skoti.learning.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedWordInTextFile {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("S:\\Learning\\javaPrograms\\javaPrograms\\Strings\\output.txt"));
		Map<String, Integer> hmap = new HashMap<>();
		String readLine = bufferedReader.readLine();

		while (readLine != null) {
			String[] splitArray = readLine.toLowerCase().split(" ");

			for (String word : splitArray) {
				if (hmap.containsKey(word)) {
					hmap.put(word, hmap.get(word) + 1);
				} else {
					hmap.put(word, 1);
				}
			}
			readLine = bufferedReader.readLine();
		}

		String mostRepeatedWord = null;
		int count = 0;

		Set<Entry<String, Integer>> entrySet = hmap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > count) {
				mostRepeatedWord = entry.getKey();
				count = entry.getValue();
			}
		}
		System.out.println("Most repeated word is: "+ mostRepeatedWord + " and count is: "+ count);
		bufferedReader.close();
	}

}

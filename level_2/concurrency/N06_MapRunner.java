package com.leveltwo.concurrency;

import java.util.HashMap;
import java.util.Map;

public class N06_MapRunner {
	public static void main(String[] args) {
		String str = "Hello World";
		Map<Character, Integer> occurrences = new HashMap<>();
		char[] characters = str.toCharArray();
		for (char character : characters) {// The code within the for loop does a get and then a put.
			// It is not thread safe.
			Integer count = occurrences.get(character);
			if (count == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, count + 1);
			}
		}
	}

}

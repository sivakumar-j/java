package com.basics.packageone;

import java.util.HashMap;
import java.util.Map;

public class n8_MapRunner {
	public static void main(String[] args) {

		String v_str = "You are reading a sentence made for testing this program.";
		char[] v_characters = v_str.toCharArray();
		Map<Character, Integer> v_mapoccurrences = new HashMap<>();
		for (char v_loopcharacter : v_characters) {
			Integer v_count = v_mapoccurrences.get(v_loopcharacter);
			if (v_count == null) {
				v_mapoccurrences.put(v_loopcharacter, 1);
			} else {
				v_mapoccurrences.put(v_loopcharacter, v_count + 1);
			}
		}
		System.out.println(v_mapoccurrences);

		String[] v_words = v_str.split(" ");
		Map<String, Integer> v_mapfrequency = new HashMap<>();
		for (String v_loopword : v_words) {
			Integer v_number = v_mapfrequency.get(v_loopword);
			if (v_number == null) {
				v_mapfrequency.put(v_loopword, 1);
			} else {
				v_mapfrequency.put(v_loopword, v_number + 1);
			}
		}
		System.out.println(v_mapfrequency);
	}
}

package com.leveltwo.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class N07_ConcurrentMapRunner {
	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			LongAdder longAdder = occurances.get(character);
			if (longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(character, longAdder);
			// System.out.println("Before computeIfAbsent : " + occurances);

		}

		System.out.println("Before computeIfAbsent : " + occurances);

		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}

		System.out.println("computeIfAbsent Occurn " + occurances);
	}

}

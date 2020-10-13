package com.leveltwo.packageone;

import java.util.List;

public class n8_MethodReferencesRunner {
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		int max = List.of(23, 45, 67, 34).stream().filter(num -> num % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);

		System.out.println("Without Method Ref max is " + max);
		int maximum = List.of(23, 45, 67, 34).stream().filter(n8_MethodReferencesRunner::isEven).max(Integer::compare)
				.orElse(0);

		System.out.println("With Method Ref max is " + maximum);
	}

	public static boolean isEven(Integer number) {
		return (number % 2 == 0);
	}
}

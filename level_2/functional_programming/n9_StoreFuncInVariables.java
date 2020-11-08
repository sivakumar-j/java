package com.leveltwo.packageone;

import java.util.List;
import java.util.function.Predicate;

public class n9_StoreFuncInVariables {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 12, 34, 45, 36, 48);
		// Predicate<? super Integer> evenPredicate = num -> num % 2 == 0;
		// Predicate<? super Integer> oddPredicate = num -> num % 2 == 1;
		// https://www.youtube.com/watch?v=Tapz6_T5oHY&ab_channel=JavaTechie
		Predicate<? super Integer> evenPredicate = even_extracted();
		Predicate<? super Integer> oddPredicate = odd_extracted();

		numbers.stream().filter(evenPredicate).map(n -> n * n).forEach(e -> System.out.println(e));
	}

	private static Predicate<? super Integer> odd_extracted() {
		return num -> num % 2 == 1;
	}

	private static Predicate<? super Integer> even_extracted() {
		return num -> num % 2 == 0;
	}
}

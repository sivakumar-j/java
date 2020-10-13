package com.leveltwo.packageone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class n6_CustomLamdaRunner_two {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		System.out.println(numbers);
		printFPallterminalops(numbers);
	}

	static void printFPallterminalops(List<Integer> numbers) {

		System.out.println("The sum is " + numbers.stream().map(n -> n * 2).reduce(0, (n1, n2) -> n1 + n2));
		System.out.println("Range sum " + IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));
		System.out.println("The Max is " + numbers.stream().max((n1, n2) -> Integer.compare(n1, n2)).get());
		// if we don't give get() null or null pointer exception will occur
		System.out
		.println("Demo of collectors " + numbers.stream().filter(e -> e % 2 == 1).collect(Collectors.toList()));
		// demo of output as list
		System.out
		.println("Box demo is " + IntStream.range(1, 11).map(n -> n * n).boxed().collect(Collectors.toList()));
		// Box will convert int to Integer wrapper class for collections
		System.out.println("Option Demo is" + List.of(23, 45, 67).stream().filter(num -> num % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));
		// this avoids null and null pointer exception
	}

}

package com.leveltwo.packageone;

import java.util.List;

public class n5_CustomLamdaRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		System.out.println(numbers);
		printFPSum(numbers);
		printFPallIntermediates(numbers);
	}

	static void printFPSum(List<Integer> numbers) {
		int sum = numbers.stream()
				.reduce(0,
						(num1, num2) -> {
							System.out.println(num1 + " " + num2);
							return num1 + num2;
						});
		System.out.println("Even Numbers Sum: " + sum);
	}

	static void printFPallIntermediates(List<Integer> numbers) {
		numbers.stream().sorted().forEach(elem -> System.out.println("Sort :" + elem));
		numbers.stream().distinct().forEach(elem -> System.out.println("Distinct :" + elem));
		numbers.stream().filter(n -> n % 2 == 0).forEach(elem -> System.out.println("Filter :" + elem));
		numbers.stream().map(n -> n * 2).forEach(elem -> System.out.println("Map :" + elem));

	}

}


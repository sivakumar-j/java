package com.leveltwo.packageone;

import java.util.List;

public class n1_FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
		// printBasic(list);
		printFunctional(list);
	}

	public static void printBasic(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

	public static void printFunctional(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
}


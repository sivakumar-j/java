package com.leveltwo.packageone;

import java.util.List;

public class n2_FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<Integer> v_list = List.of(1, 22, 333);
		// printBasic(list);
		printFunctional(v_list);
	}


	public static void printFunctional(List<Integer> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
}


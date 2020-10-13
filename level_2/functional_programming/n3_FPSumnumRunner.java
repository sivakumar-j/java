package com.leveltwo.packageone;

import java.util.List;


public class n3_FPSumnumRunner {
	public static void main(String[] args) {
		List<Integer> v_lnumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		printFPEvenSum(v_lnumbers);
		printFPOddSum(v_lnumbers);
	}

	static void printFPEvenSum(List<Integer> in_numbers) {
		int sum = in_numbers.stream().filter(elem -> elem % 2 == 0).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("Even Numbers Sum: " + sum);
	}

	static void printFPOddSum(List<Integer> in_numbers) {
		int sum = in_numbers.stream().filter(elem -> elem % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("Odd Numbers Sum: " + sum);
	}

}

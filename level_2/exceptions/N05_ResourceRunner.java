package com.leveltwo.exception;

import java.util.Scanner;

public class N05_ResourceRunner {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[21];
			// no need to close the scanner..it will close automatically..and no need for
			// catch and finally
		}
	}
}

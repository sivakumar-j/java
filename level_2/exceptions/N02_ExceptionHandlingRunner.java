package com.leveltwo.exception;

public class N02_ExceptionHandlingRunner {
	public static void main(String[] args) {
		method1();
		System.out.println("main() Done");
	}

	static void method1() {
		method2();
		System.out.println("method1() done");
	}

	static void method2() {
		try {
			int[] numbers = { 1, 2 };
			int num = numbers[3];
			System.out.println("method2() Done");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

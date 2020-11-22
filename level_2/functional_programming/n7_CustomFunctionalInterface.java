package com.leveltwo.packageone;

import java.util.Arrays;
//program to give demo that what goes behing in Functional programming
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class EvenNumberPredicate implements Predicate<Integer> {
	// Predicate accepts i/p and returns a boolean to stream

	@Override
	public boolean test(Integer num) {
		return num % 2 == 0;
	}
}

class SysOutConsumer implements Consumer<Integer> {
	// Consumer accepts i/p and returns nothing to stream
	@Override
	public void accept(Integer num) {
		System.out.println(num);
	}
}

class SupplierDemo implements Supplier<String>{
	// Supplier accepts nothing and returns anything;

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Nothing found";
	}

	// System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewers"));

}

public class n7_CustomFunctionalInterface {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 12, 34, 45, 36, 48);
		// List<Integer> evens = numbers.stream()
		// .filter(n -> n%2==0)
		// .collect(Collectors.toList());

		// List<Integer> evensToo = numbers.stream()
		// .filter(new EvenNumberPredicate())
		// .collect(Collectors.toList());

		numbers.stream()
		.filter(new EvenNumberPredicate())
		.forEach(new SysOutConsumer());

		// List<String> list1 = Arrays.asList("apple", "bat");
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(new SupplierDemo()));
	}
}


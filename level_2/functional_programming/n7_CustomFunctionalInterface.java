package com.leveltwo.packageone;

//program to give demo that what goes behing in Functional programming
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer num) {
		return num % 2 == 0;
	}
}

class SysOutConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer num) {
		System.out.println(num);
	}
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
	}
}


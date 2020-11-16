package com.basics.packageone;

import java.util.Arrays;
import java.util.List;


// upper bound means ..upper is bounded ..lower is free..free to choose from lower range
// lower bound means.. lower is bounded.. upper is free...free to choose from upper range

public class n9_Generics_upperbound {

	public static double sum(List<? extends Number> numberlist) {
		double sum = 0.0;
		for (Number n : numberlist)
			sum += n.doubleValue();
		return sum;
	}

	public static void main(String args[]) {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sum(integerList));

		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sum(doubleList));
	}

}


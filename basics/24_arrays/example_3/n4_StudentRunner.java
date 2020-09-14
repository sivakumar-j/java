package com.basics.packageone;

import java.math.BigDecimal;

public class n4_StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		n4_Student student = new n4_Student("Ranga", 97, 98, 100);
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks : " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks : " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks : " + minimumMark);

		BigDecimal average = student.getAverageOfMarks();
		System.out.println("Average of marks : " + average);
		System.out.println(student);

		student.addMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(1);
		System.out.println(student);

	}

}

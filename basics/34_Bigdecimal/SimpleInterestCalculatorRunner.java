package com.basics.packageone;

import java.math.BigDecimal;

public class n3_SimpleInterestCalculatorRunner {
	public static void main(String[] args) {
		n3_SimpleInterestCalculator calculator = new n3_SimpleInterestCalculator("4500.99", "7.5256");
		BigDecimal totalValue = calculator.calculateTotalValue(5);// 5 years //6187.50000
		System.out.println("Total amount is " + totalValue);
	}
}

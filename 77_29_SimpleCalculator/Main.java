package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleCalculator simcal = new SimpleCalculator();
        simcal.setFirstNumber(10);
        simcal.setSecondNumber(0);
        System.out.println("add= "+simcal.getAdditionResult());
        System.out.println("Sub= "+simcal.getSubtractionResult());
        System.out.println("Mul="+simcal.getMultiplicationResult());
        System.out.println("Div"+simcal.getDivisionResult());
    }
}

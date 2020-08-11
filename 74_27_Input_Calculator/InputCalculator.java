package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Please enter an Integer");

        while(scanner.hasNextInt()){
            System.out.println("Please enter an Integer");
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }
}

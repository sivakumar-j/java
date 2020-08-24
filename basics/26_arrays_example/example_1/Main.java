package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner v_scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter v_count:");
        int v_count = v_scanner.nextInt();
        v_scanner.nextLine();

        int[] v_returnedArray = readIntegers(v_count);
        int v_returnedMin = findMin(v_returnedArray);

        System.out.println("min = " + v_returnedMin);

    }

    private static int[] readIntegers(int v_count) {

        int[] v_array = new int[v_count];

        for(int i = 0; i<v_array.length; i++) {
            System.out.println("Enter a v_number:");
            int v_number = v_scanner.nextInt();
            v_scanner.nextLine();
            v_array[i] = v_number;
        }
        return v_array;
    }

    private static int findMin(int[] v_array) {

        int v_min = Integer.MAX_VALUE;

        for(int i=0; i<v_array.length; i++) {
            int v_value = v_array[i];

            if(v_value < v_min) {
                v_min = v_value;
            }
        }

        return v_min;
    }
}

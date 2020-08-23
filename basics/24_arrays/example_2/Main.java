package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner v_scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] v_myIntegers = getIntegers(5);
        int[] v_sorted = sortIntegers(v_myIntegers);
        printArray(v_sorted);

    }

    public static int[] getIntegers(int v_capacity) {
        int[] v_array = new int[v_capacity];
        System.out.println("Enter " + v_capacity +" integer values:\r");
        for(int i=0; i<v_array.length; i++) {
            v_array[i] = v_scanner.nextInt();
        }
        return v_array;
    }

    public static void printArray(int[] v_array) {
        for(int i=0; i<v_array.length; i++) {
            System.out.println("Element " + i + " contents " + v_array[i]);
        }
    }

    public static int[] sortIntegers(int[] v_array) {
//        int[] v_sortedArray = new int[v_array.length];
//        for(int i=0; i<v_array.length; i++) {
//            v_sortedArray[i] = v_array[i];
//        }
        int[] v_sortedArray = Arrays.copyOf(v_array, v_array.length);

        boolean v_flag = true;
        int v_temp;
        while(v_flag) {
            v_flag = false;
            // element 0     160
            // element 1     50
            // element 2     40

            for(int i=0; i<v_sortedArray.length-1; i++) {
                if(v_sortedArray[i] < v_sortedArray[i+1]) {
                    v_temp = v_sortedArray[i];
                    v_sortedArray[i] = v_sortedArray[i+1];
                    v_sortedArray[i+1] = v_temp;
                    v_flag = true;
                }
            }
        }

        return v_sortedArray;
    }


}

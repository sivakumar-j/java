package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int min_num;

        System.out.println("Min in How many numbers");

        min_num = scanner.nextInt();

        int[] num_arr_1 = readIntegers(min_num);

        int minnuminarr = findmin(num_arr_1);

        System.out.println("Min num is "+ minnuminarr);

    }

    public static int[] readIntegers(int min_num){
        int[] num_arr_2 = new int[min_num];
        System.out.println("Input "+min_num+" numbers");
        for (int i = 0; i < min_num; i++) {
            num_arr_2[i] = scanner.nextInt();
        }
        return  num_arr_2;
    }

    public static int findmin(int[] num_arr_1){
        int min = num_arr_1[0];

        for (int i = 1; i <num_arr_1.length ; i++) {
            min = min>=num_arr_1[i]?num_arr_1[i]:min;
        }

        return min;
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int min_num;

        System.out.println("How many Elements In Arrays");

        min_num = scanner.nextInt();

        int[] num_arr_1 = readIntegers(min_num);

        System.out.println("Array b4 is "+ Arrays.toString(num_arr_1));

        reverse_array(num_arr_1);

    }

    public static int[] readIntegers(int min_num){
        int[] num_arr_2 = new int[min_num];
        System.out.println("Input "+min_num+" numbers");
        for (int i = 0; i < min_num; i++) {
            num_arr_2[i] = scanner.nextInt();
        }
        return  num_arr_2;
    }

    public static void reverse_array(int[] num_arr_1){
        int[] num_arr_2 = new int[num_arr_1.length];
            for (int j = 0; j < num_arr_1.length; j++) {
                num_arr_2[j] = num_arr_1[(num_arr_1.length-1)-j];
            }
        System.out.println("Array After is "+ Arrays.toString(num_arr_2));
    }
}

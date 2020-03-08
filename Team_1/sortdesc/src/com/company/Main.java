package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] int_arr_1 =  getint(5);
        print_arr_1(int_arr_1);
        int[] after_sort_1 = sortint(int_arr_1);
        print_arr_1(after_sort_1);
    }

    public static int[] getint(int noofip){
        int[] r_int_arr_1 =  new int[noofip];
        for (int i = 0; i <noofip ; i++) {
            r_int_arr_1[i] = scanner.nextInt();
        }
        return r_int_arr_1;
    }

    public static void print_arr_1(int[] int_arr_1){
        for (int i = 0; i <int_arr_1.length ; i++) {
            System.out.println("The int in :"+i+" th position is :"+int_arr_1[i]);
        }
    }

    public static int[] sortint(int[] v_sort_int){

      int temp;
        for (int i = 0; i <v_sort_int.length ; i++) {
            for (int j = i+1; j <v_sort_int.length ; j++) {
                if(v_sort_int[j]>v_sort_int[i]){
                    temp = v_sort_int[i];
                    v_sort_int[i]=v_sort_int[j];
                    v_sort_int[j]=temp;
                }
            }
        }
        return v_sort_int;
    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Scanner scanner = new Scanner(System.in);
        System.out.println("No of paint box to buy "+PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("No of paint box to buy "+PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("No of paint box to buy "+PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println("No of paint box to buy "+PaintJob.getBucketCount(-7.14, 1.5));
    }
}

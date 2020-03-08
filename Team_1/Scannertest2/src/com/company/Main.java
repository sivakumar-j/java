package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur Age");
        boolean isint = scanner.hasNextInt();
        if(isint){
            System.out.println("Yes its Int");
        } else {
            System.out.println("No it isn't");
        }
        scanner.close();
    }
}

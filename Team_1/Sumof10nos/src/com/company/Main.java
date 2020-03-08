package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
	// write your code here
        for(int i=1;i<=10;i++){
            System.out.println("Enter the "+i+"st value ");
            if(scanner.hasNextInt()){
                sum = sum + scanner.nextInt();
                scanner.nextLine();
            }else{
                System.out.println("Invalid Ip.Enter Again");
                i--;
                scanner.nextLine();
            }
        }
        System.out.println("Sum is "+ sum);
        scanner.close();
    }
}

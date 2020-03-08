package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter your YOB");
        Scanner scanner = new Scanner(System.in);
        boolean isint = scanner.hasNextInt();
        //int age = scanner.nextInt();
        if (isint) {
            //System.out.println("Enter ur Age");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter you Name");
            String name = scanner.nextLine();
            System.out.println(name+" is "+(2019-age)+" Years old");
        } else{
            System.out.println("Unable to parse");
        }



        //System.out.println("Out");
        scanner.close();
    }
}

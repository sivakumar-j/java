package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 5;
        if(PerfectNumber.isPerfectNumber(x)){
            System.out.println(x + " is a perfect number");
        }else{
            System.out.println("No " + x + "is a NOT perfect number");
        }
    }
}

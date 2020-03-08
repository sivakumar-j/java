package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int j=1;j<=100;j++){
            if(isPrimeOrNot(j)){
                System.out.println("Number "+j+" Is Prime" );
            }
        }
    }

    private static boolean isPrimeOrNot(int in_is_prime){
        for(int i=2;i<in_is_prime;i++) {
            if (in_is_prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
package com.company;

public class LargestPrime3 {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;
        boolean isPrime;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {

                isPrime = true;

                for (int j = 2; j <= i/2; j++) {

                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;

    }

}
package com.company;

public class LargestPrime2 {
    public static int getLargestPrime(int number){
        int new_prime = 0;
        int max_prime = 0;
        boolean prime_num = false;

        if(number <= 0){
            return -1;
        }
        for(int i=2;i<number/2;i++){

            if(number % i == 0){//21/2-False//21/3-True//21/4-False//21/5--False/21/7
                if(isPrimeOrNot(i)){
                    new_prime = i;
                }
            }
            max_prime = (new_prime >=max_prime)?new_prime:max_prime;//0//3//3/3
        }

        return max_prime;
    }
    public static boolean isPrimeOrNot(int in_is_prime){
        for(int i=2;i<in_is_prime;i++) {
            if (in_is_prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}

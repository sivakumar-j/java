package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int new_prime = 0;
        int max_prime = 0;
        boolean prime_num = true;

        if(number <= 1 ){
            return -1;
        }

       for(int i=2;i<=number;i++){
           if(number % i == 0){
               prime_num = true;
               for(int j=2;j<i;j++){
                   if (i % j == 0) {
                       //Do nothing;
                       prime_num = false;
                       //break;
                   }
               }
               if(prime_num) {
                   new_prime = i;
               }

           }
            max_prime = (new_prime >=max_prime)?new_prime:max_prime;
       }
       return max_prime;
    }
}

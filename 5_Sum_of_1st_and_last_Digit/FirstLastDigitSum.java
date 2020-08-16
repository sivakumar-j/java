package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit ( int number){

        if(number < 0){
            return -1;
        }
                int firstdigit= number % 10;;
                int lastdigit = 0;
            do{
                lastdigit = number % 10;//3//4//1
                number = number /10;//14//1/0
              }while(number > 0);

            return  (firstdigit + lastdigit);

    }
}

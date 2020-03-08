package com.company;

public class getEvenDigitSum {
    public static int getEvenDigitSum ( int number){

        if(number < 0){
            return -1;
        }
        int v_sum_of_even_digit= 0;
        int v_div_by_10 = 0;

        do{
            v_div_by_10 = number % 10;//3//4//1
            if(v_div_by_10%2 == 0){
                v_sum_of_even_digit +=v_div_by_10;
            }
            number = number /10;//14//1/0
        }while(number > 0);

        return  (v_sum_of_even_digit);

    }
}

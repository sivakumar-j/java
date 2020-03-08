package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        if(number < 0){
            //return false;
            number = -1 * number;
        }
        int lastdigit = 1;
        int reverse   = 0;
        int original_num = number;
        do{
            lastdigit = number % 10;//3//4//1
            reverse = reverse * 10;//0//30//340
            reverse = reverse + lastdigit;//3//34//341
            number = number /10;//14//1/0
        }while(number > 0);

        return  (original_num == reverse);
    }
}
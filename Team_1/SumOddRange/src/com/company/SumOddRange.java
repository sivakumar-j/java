package com.company;

public class SumOddRange {

    public static boolean isOdd (int number){
        if(number<0){
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start ,int end){

         if(start < 0 || end < 0 || end<start){
            return -1;
         }

        int sum_of_odds = 0;

        for(int i = start;i<= end;i++) {
            if (isOdd(i)) {
            sum_of_odds = sum_of_odds + i;
            }
        }
        return sum_of_odds;
    }
}

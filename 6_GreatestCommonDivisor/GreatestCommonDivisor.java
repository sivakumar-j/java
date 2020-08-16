package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a,int b){
        if(a<10 || b<10){
            return -1;
        }
        int new_cd = 0;
        int max_cd = 0;
        for(int i = 1;i<= a;i++){

            if(a%i ==0 && b%i ==0){
                 new_cd = i;
            }
            max_cd = (new_cd > max_cd) ?new_cd : max_cd;
        }
        return max_cd;
    }
}

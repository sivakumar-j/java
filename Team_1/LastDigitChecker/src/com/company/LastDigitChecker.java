package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x,int y ,int z){
        if(!isValid(x) || !isValid(y) || !isValid(z)){
            return false;
        }
        int a = x%10;
        int b = y%10;
        int c = z%10;
        return a == b || a == c || b == c;
        //return false;
    }

    public static boolean isValid(int z){
        if(z < 10 || z>1000){
            return false;
        }
        return true;
    }
}

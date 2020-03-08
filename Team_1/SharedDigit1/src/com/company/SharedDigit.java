package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int x,int y){
        if(x < 10 || x > 99 || y< 10 || y > 99){
            return false;
        }
        int v_last_dig_x = x%10;
        int v_first_dig_x = x/10;
        int v_last_dig_y = y%10;
        int v_first_dig_y = y/10;

        return (v_first_dig_x == v_first_dig_y
                || v_first_dig_x == v_last_dig_y
                || v_last_dig_x == v_first_dig_y
                || v_last_dig_x == v_last_dig_y);

    }

}

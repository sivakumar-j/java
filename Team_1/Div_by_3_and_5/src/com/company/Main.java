package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int cnt = 1;
        for(int i=1;i<=1000;i++){
            if(i%3 == 0 && i%5 ==0){
                if (cnt <= 5) {
                    System.out.println(i);
                    cnt++;
                }
            }
        }
    }
}

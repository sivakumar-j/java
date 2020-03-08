package com.company;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if(i==1 || i == number){
                    for(int k=1;k<=number;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                }else if((j == 1 ) || i == j|| (j==((number-i)+1))){
                    System.out.print("*");
                }else if(j==number){
                    System.out.println("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}

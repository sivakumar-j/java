package com.company;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number <0){
            System.out.println("Invalid Value");
            return;
        }
            int dig_cnt = getDigitCount(number);
        //System.out.println("Num of Dig "+ dig_cnt);
            int rev_num = reverse(number);
        //System.out.println("Number is "+ number);
        //System.out.println("Reverse No "+ rev_num);
            int rev_num_rem_10 = 0;
            int doloop_cnt = 0;
            do{
                doloop_cnt = doloop_cnt + 1;
                rev_num_rem_10 = rev_num % 10;
                    switch (rev_num_rem_10){
                        case 0:
                            System.out.print("Zero ");break;
                        case 1:
                            System.out.print("One ");break;
                        case 2:
                            System.out.print("Two ");break;
                        case 3:
                            System.out.print("Three ");break;
                        case 4:
                            System.out.print("Four ");break;
                        case 5:
                            System.out.print("Five ");break;
                        case 6:
                            System.out.print("Six ");break;
                        case 7:
                            System.out.print("Seven ");break;
                        case 8:
                            System.out.print("Eight ");break;
                        case 9:
                            System.out.print("Nine ");break;
                        default:
                            System.out.print("Invalid number ");
                    }
                    rev_num = rev_num/10;

                        if(rev_num <=0  && (doloop_cnt != dig_cnt)){
                            for(int i=1;i<=(dig_cnt-doloop_cnt);i++){
                                System.out.print("Zero ");
                            }

                        }

            }while(rev_num > 0);
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        //System.out.println("get_dig_number is "+number);
            int v_dig_cnt = 0;
            int mod10 = 0;
            do{
                v_dig_cnt = v_dig_cnt + 1;
                //System.out.println("getDig_func_v_dig_cnt "+v_dig_cnt);
                number = number / 10;
                //System.out.println("get_dig_number 2 is "+number);

            }while (number > 0);
        return v_dig_cnt;
    }
    public static int reverse(int number){
        int orig_num = number;
        if(orig_num < 0){
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

        if(orig_num < 0){
            return (-1 * reverse);
        }else{
            return reverse;
        }

    }
}

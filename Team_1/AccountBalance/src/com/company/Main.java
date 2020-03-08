package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AccountBalance accountBalance = new AccountBalance();
        accountBalance.setAc_no(1010);
        accountBalance.setAc_name("Anand");
        accountBalance.setAc_curr_bal(100);
        accountBalance.deposit(10);
        accountBalance.withdraw(1);

    }
}

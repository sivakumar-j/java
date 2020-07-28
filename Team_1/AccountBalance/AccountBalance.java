package com.company;

public class AccountBalance {
    private int ac_no;
    private String ac_name;
    private double ac_curr_bal;

    public void setAc_no(int ac_no){
        this.ac_no=ac_no;
    }

    public void setAc_name(String ac_name){
        this.ac_name=ac_name;
    }
    public void setAc_curr_bal(double ac_curr_bal){
        this.ac_curr_bal=ac_curr_bal;
    }

    public int getAc_no(){
        return this.ac_no;
    }

    public String getAc_name(){
        return this.ac_name;
    }

    public double getAc_curr_bal(){
        return this.ac_curr_bal;
    }

    public void deposit(double amt){
        if(amt <=0){
            System.out.println(getAc_no()+" has Nothing to Deposit.Balance is "+getAc_curr_bal());
            return;
        }
        setAc_curr_bal(getAc_curr_bal() + amt);
        System.out.println(getAc_no()+" has been credited. Balance is "+ (getAc_curr_bal()));
    }

    public void withdraw(double amt){
        if(amt <=0){
            System.out.println(getAc_no()+" has Nothing to Withdraw.Balance is "+getAc_curr_bal());
            return;
        }
        if(getAc_curr_bal()-amt<0){
            System.out.println(getAc_no()+"has insufficent balance "+getAc_curr_bal());
            return;
        }
        setAc_curr_bal(getAc_curr_bal() - amt);
        System.out.println(getAc_no()+" has been debited. Balance is "+ (getAc_curr_bal()));
    }
}

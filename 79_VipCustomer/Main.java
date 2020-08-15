package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("Name : "+vipCustomer1.getName()+" Cr Limit: "+vipCustomer1.getCr_limit()
        +" Email: "+vipCustomer1.getEmail());
        VipCustomer vipCustomer2 = new VipCustomer("B",101);
        System.out.println("Name : "+vipCustomer2.getName()+" Cr Limit: "+vipCustomer2.getCr_limit()
                +" Email: "+vipCustomer2.getEmail());
        VipCustomer vipCustomer3 = new VipCustomer("C",102,"name3@email.com");
        System.out.println("Name : "+vipCustomer3.getName()+" Cr Limit: "+vipCustomer3.getCr_limit()
                +" Email: "+vipCustomer3.getEmail());
    }
}

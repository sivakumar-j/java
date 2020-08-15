package com.company;

public class     {
    private String name;
    private double cr_limit;
    private String email;

    public VipCustomer() {
        //System.out.println("Inside 1stA constructor");

        this("A",100,"name1@email.com");

        System.out.println("Inside 1st constructor");

    }

    public VipCustomer(String name, double cr_limit) {

        this(name,cr_limit,"name2@email.com");
        System.out.println("Inside 2nd constructor");
    }

    public VipCustomer(String name, double cr_limit, String email) {
        System.out.println("Inside 3rd constructor");
        this.name = name;
        this.cr_limit = cr_limit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCr_limit() {
        return this.cr_limit;
    }

    public String getEmail() {
        return this.email;
    }
}

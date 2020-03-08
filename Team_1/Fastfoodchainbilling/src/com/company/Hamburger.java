package com.company;

public class Hamburger {
    private  String h_name;
    private  String h_meat;
    private  double h_base_price;
    private  String h_rolltype;
    private  double h_total_price;

    public Hamburger(String h_name, String h_meat, double h_price, String h_rolltype) {
        this.h_name = h_name;
        this.h_meat = h_meat;
        this.h_base_price = h_price;
        this.h_rolltype = h_rolltype;
        this.h_total_price = 0;
    }

    public String getH_name() {
        return h_name;
    }

    public String getH_meat() {
        return h_meat;
    }

    public double getH_base_price() {
        return h_base_price;
    }

    public String getH_rolltype() {
        return h_rolltype;
    }

    public void Add_addons_1(String h_a_name,double h_a_price){



    }

}

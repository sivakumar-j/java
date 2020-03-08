package com.company;

public class Healthy extends Hamburger {
    private String hy_meat;
    private double hy_price;

    public Healthy( String hy_meat, double hy_price) {
        super("Healthy", hy_meat,"Wheat",hy_price);
    }

    public void set_addon_3(String h_3_addon_name,double h_3_addon_price){
        System.out.println("Addon3 Not allowed for Healthy Burger");
    }


    public void set_addon_4(String h_4_addon_name,double h_4_addon_price){
        System.out.println("Addon4 Not allowed for Healthy Burger");
    }
}

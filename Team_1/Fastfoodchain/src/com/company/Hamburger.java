package com.company;

public class Hamburger {
    private String h_name;
    private String h_meat;
    private String h_roll;
    private double h_base_price;
    private double h_total_price;

    private String h_1_addon_name;
    private double h_1_addon_price;

    private String h_2_addon_name;
    private double h_2_addon_price;

    private String h_3_addon_name;
    private double h_3_addon_price;

    private String h_4_addon_name;
    private double h_4_addon_price;



    public Hamburger(String h_name, String h_meat, String h_roll,double h_base_price) {
        this.h_name = h_name;
        this.h_meat = h_meat;
        this.h_roll = h_roll;
        this.h_base_price = h_base_price;
        this.h_total_price = 0;
    }

    public void set_addon_1(String h_1_addon_name,double h_1_addon_price){
        this.h_1_addon_name = h_1_addon_name;
        this.h_1_addon_price = h_1_addon_price;
    }

    public void set_addon_2(String h_2_addon_name,double h_2_addon_price){
        this.h_2_addon_name = h_2_addon_name;
        this.h_2_addon_price = h_2_addon_price;
    }

    public void set_addon_3(String h_3_addon_name,double h_3_addon_price){
        this.h_3_addon_name = h_3_addon_name;
        this.h_3_addon_price = h_3_addon_price;

    }

    public void set_addon_4(String h_4_addon_name,double h_4_addon_price){
        this.h_4_addon_name = h_4_addon_name;
        this.h_4_addon_price = h_4_addon_price;

    }

    public double total_add_ons(){

        h_total_price = h_base_price;

        System.out.println("Base price of "+ h_name + " Burger with Meat : " + h_meat + " Made Of Roll :"+ h_roll+" is : "+h_base_price);


       if(h_1_addon_name!=null){
           h_total_price += h_1_addon_price;
           System.out.println("Add on1 : "+ h_1_addon_name + " Price : "+h_1_addon_price);
       }

        if(h_2_addon_name!=null){
            h_total_price += h_2_addon_price;
            System.out.println("Add on2 : "+ h_2_addon_name + " Price : "+h_2_addon_price);
        }

        if(h_3_addon_name!=null){
            h_total_price += h_3_addon_price;
            System.out.println("Add on3 : "+ h_3_addon_name + " Price : "+h_3_addon_price);
        }

        if(h_4_addon_name!=null){
            h_total_price += h_4_addon_price;
            System.out.println("Add on4 : "+ h_4_addon_name + " Price : "+h_4_addon_price);
        }

        return  h_total_price;

    }

}

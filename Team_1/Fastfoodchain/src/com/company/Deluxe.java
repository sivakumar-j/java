package com.company;

public class Deluxe extends  Hamburger {

    public Deluxe() {
        super("Maharaja", "CountryEgg", "Wheat", 50);
        super.set_addon_1("Chips",50);
        super.set_addon_2("Coke",50);
    }

    public void set_addon_1(String h_1_addon_name,double h_1_addon_price){
        System.out.println("Addon1 Not allowed for Deluxe Burger");
    }


    public void set_addon_2(String h_2_addon_name,double h_2_addon_price){
        System.out.println("Addon2 Not allowed for Deluxe Burger");
    }

    public void set_addon_3(String h_3_addon_name,double h_3_addon_price){
        System.out.println("Addon3 Not allowed for Deluxe Burger");
    }


    public void set_addon_4(String h_4_addon_name,double h_4_addon_price){
        System.out.println("Addon4 Not allowed for Deluxe Burger");
    }
}

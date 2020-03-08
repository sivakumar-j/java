package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger ham1 = new Hamburger("McVeggie","Egg","Wheat",25);
        ham1.set_addon_1("Cheese",  15);
        ham1.set_addon_2("Onion",   10);
        ham1.set_addon_3("Cucumber",5);
        ham1.set_addon_4("Tomato",  5);
        System.out.println("Total :            "+ ham1.total_add_ons());

        Healthy ham2 = new Healthy("Veg",40);
        ham2.set_addon_1("Cheese",15);
        ham2.set_addon_2("Sause",15);
        ham2.set_addon_3("Extracheese",15);
        ham2.set_addon_4("Extasause",15);
        System.out.println("Total:              "+ham2.total_add_ons());

        Deluxe ham3 = new Deluxe();
        ham3.set_addon_1("Egg",10);
        System.out.println("Total:              "+ ham3.total_add_ons());
    }
}

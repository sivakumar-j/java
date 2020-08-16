package com.company;

public class Class1 {
    private String name;
    private String mnumber;

    public Class1(String name, String mnumber) {
        this.name = name;
        this.mnumber = mnumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return mnumber;
    }

    public static Class1 add(String name, String mnumber){

        return new Class1(name,mnumber);
    }
}

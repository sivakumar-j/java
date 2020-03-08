package com.company;

public class Room {
    private Material m1;
    private Furniture f1;

    public Material getM1() {
        return m1;
    }

    public Furniture getF1() {
        return f1;
    }

    public Room(Material m1, Furniture f1) {
        this.m1 = m1;
        this.f1 = f1;
    }

    public void madeupof(){
        f1.whatfurniture();

    }
}

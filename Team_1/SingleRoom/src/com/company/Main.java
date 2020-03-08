package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimension furniture_dimension = new Dimension(10,20);
        Dimension Material_dimension = new Dimension(50,60);
        Material material_1 = new Material("Redbricks","Shankar",Material_dimension);
        Furniture furniture_1 = new Furniture("Wood","Chair",furniture_dimension);

        Room r1 = new Room(material_1,furniture_1);
        r1.getM1().whatmaterial();
        r1.madeupof();

        //furniture_1.getMaterial().

    }
}
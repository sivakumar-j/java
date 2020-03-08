package com.company;

public class Furniture {
    private String material;
    private String types;
    private Dimension f_dimension;

    public Furniture(String material, String types, Dimension f_dimension) {
        this.material = material;
        this.types = types;
        this.f_dimension = f_dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getTypes() {
        return types;
    }

    public void whatfurniture(){
        System.out.println("We have furniture's in : "+ this.material +" Of type : "+ this.types);
        f_dimension.whatdimension();
    }
}

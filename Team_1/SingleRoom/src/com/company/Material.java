package com.company;

public class Material {
    private String bricks;
    private String cement;
    private Dimension m_dimensions;

    public Material(String bricks, String cement, Dimension m_dimensions) {
        this.bricks = bricks;
        this.cement = cement;
        this.m_dimensions = m_dimensions;
    }

    public String getBricks() {
        return bricks;
    }

    public String getCement() {
        return cement;
    }

    public void whatmaterial(){
        System.out.println("Materials used are " + this.bricks +" And "+this.cement);
        m_dimensions.whatdimension();
    }
}

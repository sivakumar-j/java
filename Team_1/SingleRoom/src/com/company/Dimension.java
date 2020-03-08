package com.company;

public class Dimension {
    private  int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void whatdimension(){
        System.out.println("Dimensions are of Height :"+ height+ " Width: "+ width);
    }
}

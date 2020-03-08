package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(Point another){
        return distance(another.getX(),another.getY());
    }
    public double distance(int x,int y){
        /*System.out.println("Calling method x is : "+x);
        System.out.println("Calling method y is : "+y);
        System.out.println("Current method x is : "+this.x);
        System.out.println("Current method y is : "+this.y);*/
        return Math.sqrt(((x-this.x)*(x-this.x)) + ((y-this.y)*(y-this.y)));
    }

}

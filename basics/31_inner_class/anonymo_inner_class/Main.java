package com.company;

class class_A {

    public void show(){
        System.out.println("Im in Class A Show method");
    }
}

class class_B extends  class_A {
    @Override
    public void show() {
        System.out.println("Im in Class B Show method");
        // if we want to override the show method of class A
        // then everytime we have to create a new class and extends
        // Anonymous Inner class avoids that
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        class_A v_obj_1 = new class_A();
        class_B v_obj_2 = new class_B();
        class_A v_obj_3 = new class_A(){
            public void show(){
                System.out.println("Im in  Anonymous Inner class Show method");
            }
        };

        v_obj_1.show();
        v_obj_2.show();
        v_obj_3.show();
    }
}

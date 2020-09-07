package com.company;

class Outer
{
    static int a;

    public static void show()
    {

    }

    static class Inner  // Outer$Inner.class
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Outer v_obj = new Outer();
        v_obj.show();

		Outer.Inner v_obj_1 = new Outer.Inner();
		        //static inner class can be accessed directly with class
                //hence new Outer.Inner(); is used
        v_obj_1.display();
    }
}

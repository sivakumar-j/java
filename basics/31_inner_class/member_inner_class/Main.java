package com.company;

class Outer
{
    int a;

    public  void show()
    {

    }

    class Inner  // Outer$Inner.class
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

		Outer.Inner v_obj_1 = v_obj.new Inner();
		        //member inner class can be accessed only by the object
                //hence v_obj.new Inner() is used
        v_obj_1.display();
    }
}

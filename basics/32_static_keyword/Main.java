package  com.company;

class Emp
{
    int eid;
    int salary;
    static String ceo;

    public Emp()  // when you create an object constructor is called
    {
        eid = 1;
        salary = 3000;
        System.out.println("in constructor");
    }


    static
    {
        // when you load a class this is called..only once.. not for every object
        // also this will be the first one to be called since classes are loaded first
        // then the objects are loaded
        ceo = "Larry";
        System.out.println("in static");
    }


    public void show()
    {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class Main
{
    static int i = 0;
    public static void main(String[] args)
    {
        i = 9;

        Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 4000;
		Emp.ceo = "Mahesh";

        Emp rahul = new Emp();
		rahul.eid = 9;
		rahul.salary = 5000;
		Emp.ceo = "Mahesh";   // we dont need object

		Emp.ceo = "Nikita";
//      objects load in heap memory, whereas classes load in class loader memory in JVM
//      when we use static method , we refer to class loader memory ,that why object reference is
//      not needed

//      for this same reason we have static keyword in main method
//      which means there is no need for a object reference

        navin.show();
        rahul.show();
    }

}

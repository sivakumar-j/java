// Objects can’t be created from the Abstract classes

abstract class Human
{
	public abstract void eat();
	
	public void walk()
	{
		
	}
}

class Man extends Human
{
	public void eat()
	{
		
	}
}
public class AbstractDemo 
{
	public static void main(String[] args)
	{
		Human obj = new Man(); // Objects can be created from the classes which extends abstract class

	}
}

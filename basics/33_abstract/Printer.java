
class Printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
//	public void show(Double i) //this method is not needed since Show can be called with int,float or double since it is a Number
				   // this is possible because Number is a abstract class and Interger,Double extends from Number	
//	{
//		System.out.println(i);
//	}
}
public class AbstractDemo 
{
	public static void main(String[] args)
	{
		Printer obj = new Printer();
		obj.show(5.4f);
	}
}

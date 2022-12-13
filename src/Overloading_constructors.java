
public class Overloading_constructors 
{
	Overloading_constructors(double d)
	{
		this(10); // It will call int-arg constructor 
		System.out.println("double-arg constructor");
	}
	
	Overloading_constructors(int i)
	{
		this();// It will call no-arg constructor
		System.out.println("int-arg constructor");
	}
	
	Overloading_constructors()
	{
		System.out.println("no-arg constructor");
	}
	
	public static void main(String[] args) 
	{
		Overloading_constructors oc1=new Overloading_constructors(10.5);
		Overloading_constructors oc2=new Overloading_constructors(10);
		Overloading_constructors oc3=new Overloading_constructors();
	}

}

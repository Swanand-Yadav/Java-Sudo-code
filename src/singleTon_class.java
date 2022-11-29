
class singleTon
{
	private static singleTon st=new singleTon();// Here we created only one instance
	
	private singleTon()
	{
		// Due to private constructor no any other class will create the new object this class
	}
	public static singleTon getObjectInstance() // We took static because we can not access this method in below
	{
		System.out.println("only once Instance is created");
		return st; // Here we shared those single instance to below class by using factory method 
	}
}

public class singleTon_class 
{
	public static void main(String[] args) 
	{	
		singleTon obj=singleTon.getObjectInstance(); // This is not creating new object it will just using.
		singleTon obj1=singleTon.getObjectInstance();
	}

}

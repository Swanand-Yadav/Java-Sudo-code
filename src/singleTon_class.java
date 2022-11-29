import java.io.IOException;

class singleTon
{
	static singleTon st=new singleTon();
	private singleTon()
	{
		
	}
	public static singleTon getInstance()
	{
		System.out.println("only once Instance is created");
		return st;
	}
}

public class singleTon_class 
{
	public static void main(String[] args) 
	{	
		singleTon obj=singleTon.getInstance();
		singleTon obj1=singleTon.getInstance();
	}

}

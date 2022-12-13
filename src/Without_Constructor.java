
public class Without_Constructor // It means it have no-arg constructor.
{
	String name="Sharu";
	int roll_num=10;
	
	public void studInfo()
	{
		System.out.println("Name of Student is: "+name);
		System.out.println("Roll number of Student is: "+roll_num);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Without_Constructor wc1=new Without_Constructor(); // First Object
		wc1.studInfo();
		
		Without_Constructor wc2=new Without_Constructor(); // Second Object
		wc2.studInfo();
		
		Without_Constructor wc3=new Without_Constructor(); // Third Object
		wc3.studInfo();
	}
}

/*
 * In that above code we are not assigning any constructor value so that it will print same value for every  
 * object creation. Every new object the instance variable of copy is created and and default value will  
 * be assigned by constructor or your provided value will be assigned.
 */

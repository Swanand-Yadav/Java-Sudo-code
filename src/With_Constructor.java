
public class With_Constructor 
{
	String name;
	int roll_num;
	
	With_Constructor(String name1, int roll_num1)
	{
		this.name=name1;
		System.out.println("Name of Student is: "+name);
		
		this.roll_num=roll_num1;
		System.out.println("Roll number of Student is: "+roll_num);
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		With_Constructor wc1=new With_Constructor("Ravi",101); // Object first
		With_Constructor wc2=new With_Constructor("Shyam",102);// Object Second
		With_Constructor wc3=new With_Constructor("Kumar",103);// Object Third
	}
}

/*
 *  In above code When Object is created then that time Constructor initialize that object with our 
 *  provided values so it will print new value for every new object creation.
 */

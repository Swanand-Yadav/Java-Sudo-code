
class Parent
{
	String s="parent variable";
}

public class this_AND_super_keyword extends Parent
{
	String s="child variable";
	
	public void m1()
	{
		System.out.println(s);// It will print current class variable if not mentioned *this* keyword.
		System.out.println(this.s); // It will print current class variable
		System.out.println(super.s);// It will print parent/super class variable
	}
	public static void main(String[] args) 
	{
		this_AND_super_keyword ts=new this_AND_super_keyword();
		ts.m1();	
	}
}

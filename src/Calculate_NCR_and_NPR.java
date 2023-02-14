
public class Calculate_NCR_and_NPR 
{
	public static int fact(int a)
	{
		int temp=1;
		for(int i=1;i<=a;i++)
		{
			temp=temp*i;
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		int n=5,r=3;
		
		int ncr=fact(n)/(fact(n-r)*fact(r));
		int npr=fact(n)/fact(n-r);
		
		System.out.println("NCR is: "+ncr);
		System.out.println("NPR is: "+npr);
	}
}

import java.util.Scanner;

public class Check_number_for_even_or_odd_without_using_arithmetic_operations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for odd/even check");
		int num=sc.nextInt();
		boolean val = false;
		for(int i=1;i<=num;i++)
		{
			if(val==true)
			{
				val=false;
				if(i==num)
				{
					System.out.println(i+" is Even");
				}
				
			}else
			{
				val=true;
				if(i==num)
				{
					System.out.println(i+" is Odd");
				}				
			}
		}
	}
}

/* 
     // Another approach
 		int ans= num & 1;
		System.out.println(ans);// If the ans is 0 then num is even else odd.
 */
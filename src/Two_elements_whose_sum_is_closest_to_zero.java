
public class Two_elements_whose_sum_is_closest_to_zero 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 60, -10, 70, -80, 85};
		int sum=0,val=Integer.MAX_VALUE;
		int a=0,b=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			sum=arr[i]+arr[i+1];
			if(val>sum && sum>0)
			{
				val=sum;
				a=arr[i];
				b=arr[i+1];
			}
		}
		System.out.println(a+" , "+b);
	}
}

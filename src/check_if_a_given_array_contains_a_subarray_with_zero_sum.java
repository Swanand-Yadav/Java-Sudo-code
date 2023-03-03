
public class check_if_a_given_array_contains_a_subarray_with_zero_sum 
{
	public static void main(String[] args) 
	{
		int arr[]= {1, 2, -3, 4, 5, 6};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum==0)
				{
					System.out.println("true");
					System.exit(0);
				}
			}
			sum=0;
		}
		System.out.println("false");
	}
}

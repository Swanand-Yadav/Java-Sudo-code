
public class find_the_two_elements_from_a_given_array_of_positive_and_negative_numbers_such_that_their_sum_is_closest_to_zero 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 5, -4, 7, 8, -6};
		int sum=0,finaly=Integer.MAX_VALUE,a=0,b=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum<finaly && sum>=0)
				{
					finaly=sum;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		System.out.println(a+" + "+b);
	}
}

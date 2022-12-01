
public class Find_Second_largest_number_from_array 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,9,4,1,7,6,32,95,4};

		int firstlargest=0;
		int secondlargest=0;

		for (int i=0;i<arr.length;i++) 
		{
			if (arr[i]>firstlargest)
			{
				secondlargest=firstlargest;
				firstlargest=arr[i];
			}
		}
		System.out.println(firstlargest + " AND " + secondlargest);
	}
}

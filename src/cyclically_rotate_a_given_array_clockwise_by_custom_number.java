
public class cyclically_rotate_a_given_array_clockwise_by_custom_number 
{
	public static void main(String[] args) 
	{
		int arr[] = {6,4,3,5};
		
		int val=2;
		for(int k=1;k<=val;k++)
		{
			System.out.print("Array rotated by "+k+": ");
			for(int i=k;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			for(int i=0;i<k;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}

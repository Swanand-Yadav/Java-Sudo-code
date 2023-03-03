import java.util.Arrays;

public class Every_second_element_of_the_array_is_greater_than_its_left_and_right_elements 
{
	public static void main(String[] args)
	{
		int arr[]= {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
		int temp=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==1)
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

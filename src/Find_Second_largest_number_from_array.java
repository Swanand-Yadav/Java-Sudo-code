import java.util.Arrays;

public class Find_Second_largest_number_from_array 
{
	public static void main(String[] args) 
	{
		int[] arr = {12, 35, 1, 10, 34, 1};

		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
	}
}

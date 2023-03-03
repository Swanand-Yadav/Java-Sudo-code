import java.util.Arrays;

public class Alternative_min_max_array 
{
	public static void main(String[] args) 
	{
		int arr[]= {100, 10, 90, 20, 80, 30, 70, 40, 60, 50};
		Arrays.sort(arr); 
		
		for(int i=arr.length-1;i>arr.length/2-1;i--)
		{
			System.out.print(arr[i]+" "+arr[(arr.length-1)-i]+" ");
		}
	}
}
/* 
 * Write a Java program to sort an array of positive integers of a given array, in the sorted array 
 * the value of the first element should be maximum, second value should be minimum value, third 
 * should be second maximum, fourth second be second minimum and so on.
 */
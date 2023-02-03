import java.util.Arrays;

public class Insert_element_in_array 
{
	public static void main(String[] args) 
	{
		int arr[]= {5,3,7,9,2,6,12,4};
		 
		int Index_position = 2;
		int newValue    = 5;

		System.out.println("Original Array : "+Arrays.toString(arr));     
		   
		for(int i=arr.length-1; i > Index_position; i--)
		{
			arr[i] = arr[i-1];
		}
		  
		arr[Index_position] = newValue; 
		System.out.println("New Array: "+Arrays.toString(arr));
	}

}

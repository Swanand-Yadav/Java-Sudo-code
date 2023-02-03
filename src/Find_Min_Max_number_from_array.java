
public class Find_Min_Max_number_from_array 
{
	public static void main(String[] args) 
	{
		int arr[]= {5,3,7,9,2,6,12,4};
		
		int min=Integer.MAX_VALUE;
		int max=0;
		int difference;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		 
		difference=max-min;
		System.out.println(max+"-"+min+" = "+difference);
	}
}


public class find_maximum_difference_between_two_elements 
{
	public static void main(String[] args) 
	{
		int arr[]= { 2, 3, 1, 7, 9, 5, 11, 3, 5};
		int sum=0,diff=0, a=0, b=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				diff=Math.abs(arr[i]-arr[j]);
				if(diff>sum)
				{
					a=arr[i];
					b=arr[j];
					sum=diff;
				}
			}	
		}
		System.out.println(a+" - "+b+" = "+sum);
	}
}

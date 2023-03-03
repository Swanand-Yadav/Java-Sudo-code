
public class Replace_every_element_with_the_next_greatest_element 
{
	public static void main(String[] args) 
	{
		int arr[] = {45, 20, 100, 23, -5, 2, -6};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			System.out.print(max+" ");
			if(i==arr.length-2)
			{
				System.out.print("-1 ");
			}
			max=Integer.MIN_VALUE;
		}
	}
}

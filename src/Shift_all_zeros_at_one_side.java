
public class Shift_all_zeros_at_one_side 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,0,1,0,3,0,5,0,6};
		
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]!=0)
        	{
        		System.out.print(arr[i]+" ");
        		count++;
        	}
        }
        
		for(int i=0;i<arr.length-count;i++)
		{
			System.out.print(0+" ");
		}
	}
}

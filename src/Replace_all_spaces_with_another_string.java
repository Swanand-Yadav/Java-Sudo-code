
public class Replace_all_spaces_with_another_string 
{
	public static void main(String[] args) 
	{
		String str="Weather is nice day";
        String arr[]=str.split(" ");
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr.length-1==i)
        	{
        		System.out.print(arr[i]);
        	}else
        	{
        		System.out.print(arr[i]+"%20");
        	}	
        }
	}
}

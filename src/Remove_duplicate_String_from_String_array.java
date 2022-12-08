
public class Remove_duplicate_String_from_String_array 
{
	public static void main(String[] args) 
	{
		String str="sharu sharu sharu sharu sharu is good girl and good looking";
    	String arr[]=str.split(" ");
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i].equals(arr[j]))
    			{
    				arr[j]="duplicate";
    			}
    		}
    		if(arr[i]!="duplicate")
    		{
    			System.out.print(arr[i]+" ");
    		}	
    	}	
	}
}

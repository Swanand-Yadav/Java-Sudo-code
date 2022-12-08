
public class Find_list_of_palindrome_string_from_String 
{
	public static void main(String[] args) 
	{
		int count=0,count1=0;
    	String str="radar is on good level";
    	String arr[]=str.split(" ");
   
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<arr[i].length()/2;j++)
    		{
    			if(arr[i].charAt(j)==arr[i].charAt((arr[i].length()-1)-j))
    			{
    				count++;
    			}
    		}
    		if(count==arr[i].length()/2)
    		{
    			count1++;
    		}
    		count=0;
    	}
    	System.out.println("Total palindrome strings are: "+count1);
	}
}

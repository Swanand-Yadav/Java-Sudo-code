
public class Reverse_String_using_recursive 
{
	public static String rec(String str)
	{
		if (str.isEmpty())
		{
			System.out.println("String in now Empty");	
			return str;
		}
		
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+str.substring(1));
		return rec(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) 
	{
		String str="swanand";
    	System.out.println(rec(str));
	}
}

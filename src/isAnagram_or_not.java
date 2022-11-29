import java.util.Arrays;

public class isAnagram_or_not 
{
	public static boolean isAnagram(char a1[],char a2[])
	{
        if (a1.length != a2.length)
        {
        	 return false;
        }
        
        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i < a1.length; i++) // If you sort then you will need only one FOR loop. 
        {
        	if (a1[i] != a2[i])
        	{
        		return false;
        	}       
        }
        return true;
	}
	
    public static void main(String args[])
    { 
    	char ch1[]={'g','r','a','m'};
    	char ch2[]= {'a','r','m'};
    	
    	System.out.println(isAnagram(ch1,ch2));   
    }
}


public class isPalindrome_number 
{
	public static boolean isPalindrome(int num)
	{
		String str=Integer.toString(num);
		char ch[]=str.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length/2;i++)
		{
			if(ch[i]==ch[(ch.length-1)-i])
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count==ch.length/2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
    public static void main(String args[])
    {
    	int k=1234321;
    	System.out.println(isPalindrome(k)); 
    }
}

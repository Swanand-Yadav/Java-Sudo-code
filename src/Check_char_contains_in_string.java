
public class Check_char_contains_in_string 
{
	public static void main(String[] args) 
	{
		int count=0;
		String str="bribe";
		String str1="re";
		
		char ch1[]=str1.toCharArray();
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch1[i]==ch[j])
				{
					count++;
					break;
				}
			}
		}
		if(count==ch1.length)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}

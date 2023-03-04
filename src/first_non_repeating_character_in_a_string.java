
public class first_non_repeating_character_in_a_string 
{
	public static void main(String[] args) 
	{
		String str="gibblegabbler";
		char ch[]=str.toCharArray();
		int j=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for( j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					break;
				}
			}
			
			if(j==ch.length)
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
}

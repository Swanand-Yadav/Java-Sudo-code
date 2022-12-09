
public class Print_non_repeated_character_from_string 
{
	public static void main(String[] args) 
	{
		String str="abssnhfffnneeotykfffllmmmc";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
					ch[i]=' ';
				}
			}
			if(ch[i]!=0 && ch[i]!=' ')
			{
				System.out.print(ch[i]+" ");
			}
		}		
	}
}

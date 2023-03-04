
public class Divide_the_string_by_custom_number 
{
	public static void main(String[] args) 
	{
		String str="abcdefghijklmnopqrstuvwxy";
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i%5==0 && i!=0)
			{
				System.out.println();
			}
			System.out.print(ch[i]);
		}
	}
}

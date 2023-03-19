
public class Check_wether_given_word_contains_in_another_each_string 
{
	public static void check_str(String str, String wrd)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=wrd.toCharArray();
		int count=0;
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch2[i]==ch1[j])
				{
					count++;
					break;
				}
			}
		}
		if(count==3)
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args) 
	{
		String str="rabbit bribe dog ";  
		String wrd="bib";
		
		String arr[]=str.split(" ");
		for(int i=0;i<wrd.length();i++)
		{
			check_str(arr[i], wrd);
		}
	}
}

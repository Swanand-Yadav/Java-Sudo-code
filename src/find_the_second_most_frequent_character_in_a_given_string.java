import java.util.*;

public class find_the_second_most_frequent_character_in_a_given_string 
{
	public static void main(String[] args) 
	{
		String str="successes";
		int count=1;
		
		char arr[]=str.toCharArray();
		Map<Integer, Character> hm = new TreeMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j] && arr[i]!='*')
				{
					count++;
					arr[j]='*';
				}
			}
			if(arr[i]!='*')
			{
				hm.put(count, arr[i]);
			}
			
			count=1;
		} 
		System.out.println("The second highest occurence of character is: "+hm.get(2));
	}
}

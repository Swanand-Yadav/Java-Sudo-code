
public class Count_of_every_character_from_string 
{
	public static void main(String[] args) 
	{
		String str="swanand yadav";  
		int count=1;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!='*')
				{
					count++;
					arr[j]='*';
				}
			}
			if(arr[i]!='*' && arr[i]!=' ')
			{
				System.out.println(arr[i]+" = "+count);
			}
			count=1;
		}
	}
}

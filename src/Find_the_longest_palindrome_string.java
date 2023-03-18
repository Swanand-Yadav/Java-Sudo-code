
public class Find_the_longest_palindrome_string 
{
	public static void main(String[] args) 
	{
		String str="racecar civic deified trewqoloqwert";
		
		String arr[]=str.split(" ");
		int temp=0;
		int count=0;
		String larg_palindrome=null;
		
		for(int i=0;i<arr.length;i++)
		{
			char arr1[]=arr[i].toCharArray();
			count=0;
			
			for(int j=0;j<arr1.length/2;j++)
			{
				if(arr1[j]==arr1[(arr1.length-1)-j])
				{
					count++;
				}
			}
			if(count==arr1.length/2)
			{
				if(count>temp)
				{
					temp=count;
					larg_palindrome=arr[i];
				}
			}	
		}
		System.out.println(larg_palindrome.length()+" = "+larg_palindrome);
	}
}

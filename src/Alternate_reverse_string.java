
public class Alternate_reverse_string 
{
	public static void main(String[] args) 
	{
		String str="swanandy";  // Eg - 1234, o/p- 2143
		char temp=' ';			
		
		char arr[]=str.toCharArray();
		if(str.length()%2!=0)
		{
			System.exit(0);
		}
		for(int i=0;i<arr.length;i+=2)
		{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}

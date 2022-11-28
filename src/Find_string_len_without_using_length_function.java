
public class Find_string_len_without_using_length_function 
{
	public static void main(String args[])
    {
    	String str="swanand";
    	int i = 0;
    	for(char c: str.toCharArray())
    	{
    	   i++;
    	}
        System.out.println("The lenght of String is: "+i);
    }
}

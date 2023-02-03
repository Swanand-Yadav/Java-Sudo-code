import java.util.Arrays;

public class Sort_the_String_Array 
{
	public static void main(String[] args) 
	{
		String[] my_array1 = { "Java","Python","PHP","C#","C Programming","C++"};
		
    	Arrays.sort(my_array1);
    	
    	for(int i=0;i<my_array1.length;i++)
    	{
    		System.out.print(my_array1[i]+", ");
    	}
	}
}

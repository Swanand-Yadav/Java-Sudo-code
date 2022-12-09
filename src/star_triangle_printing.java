
public class star_triangle_printing 
{
	public static void main(String[] args) 
	{
		int row = 6;       
    	for (int i=0; i<row; i++)   
    	{      
    		for(int j=0;j<row-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=row-i;j<row;j++)
    		{
    			System.out.print("*"); // OR System.out.print("* "); This will print triangle just give space
    		}
    		System.out.println();   
    	}   
	}

}

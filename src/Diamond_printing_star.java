
public class Diamond_printing_star 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<5; i++)   
    	{      
    		for(int j=0;j<5-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=5-i;j<5;j++)
    		{
    			System.out.print(" *");
    		}
    		System.out.println();   
    	}   
    	//-------------------------------- Printing another triangle of opposite
    	for (int i=0; i<5; i++)   
    	{      
    		for(int j=0;j<i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=i;j<5;j++)
    		{
    			System.out.print(" *");
    		}
    		System.out.println();   
    	}   
	}
}

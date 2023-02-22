
public class Armstrong_number_or_not 
{
	public static void main(String[] args) 
	{
		int n = 1634;
        int temp = n;
        int p = 0;
 
        while (n > 0) 
        {
            int rem = n % 10;
            p = p + (rem * rem * rem);
            n = n / 10;
        }
 
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
	}
}

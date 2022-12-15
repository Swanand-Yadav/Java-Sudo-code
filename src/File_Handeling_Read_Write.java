import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handeling_Read_Write 
{
	public static void main(String[] args) throws IOException 
	{
		// Declare the File object
		File file=new File("C:\\Users\\admin\\Java_Sudo_code\\fileTP.txt");
		
		// Writing the file
		FileWriter fw=new FileWriter(file);
		fw.write("Swanand Yadav \n okey bye now");
		fw.close();
		
		// Reading the file
		FileReader fr=new FileReader(file);
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String str=sc.nextLine(); // It will check for next entire line.
			//String str=sc.next(); // It will check for the the only single word. 
			System.out.println(str);
		}
	}
}

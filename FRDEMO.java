//EXAMPLE ON READING DATA FROM FILE USING FILEREADER
import java.io.FileReader;									//PROVIDING ADDRESS OF CLASSES TO JVM
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.Reader;
public class FRDEMO
{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER FILE NAME");
		String fna=in.nextLine();
		int n=(int)new File(fna).length();
		char ch[]=new char[n];
		try(Reader fr=new FileReader(fna))
		{
			//int n=(int)new File(fna).length();					//CREATING OBJECT FOR FILE CLASS WITH FILE NAME AND FINDING LENGTH AND TYPECASTING LONG TO INT
			//char ch[]=new char[n];								//CREATING AN ARRAY OF LENGTH N
			fr.read(ch,0,n);										//READING DATA FROM 'O'TH POSITION TO 'N'TH POSITION
			System.out.println(ch);
		}
		catch(IOException e)
		{
			System.out.println("FILE NOT FOUND");
		}
		printSubsets(ch);
	}
	static void printSubsets(char ch[])
	    {
	        int n = ch.length;

	        // Run a loop for printing all 2^n
	        // subsets one by obe
	        for (int i = 0; i < (1<<n); i++)
	        {
	            System.out.print("{ ");

	            // Print current subset
	            for (int j = 0; j < n; j++)

	                // (1<<j) is a number with jth bit 1
	                // so when we 'and' them with the
	                // subset number we get which numbers
	                // are present in the subset and which
	                // are not
	                if ((i & (1 << j)) > 0)
	                    System.out.print(ch[j] + " ");

	            System.out.println("}");
	        }
    }
}
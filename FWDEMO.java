//EXAMPLE ON WRITING DATA INTO FILE USING FILE WRITER
import java.io.FileWriter;									//PROVIDING ADDRESS OF CLASSES TO JVM
import java.io.IOException;
import java.util.Scanner;
import java.io.Writer;
public class FWDEMO
{
	public static void main(String[]arg) throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER FILE NAME");
		String fna=in.nextLine();
		System.out.println("ENTER DATA");
		String s=in.nextLine();
		try(Writer fw=new FileWriter(fna))
		{
			fw.write(s);									//WRITING DATA OF S STRING INTO FILE
			String st="Apple,Mango,Banana";
			fw.write(st,3,8);								//WRITING DATA OF ST STRING 8 CHARCTERS FROM 3 POSITION(starts from 0)
			fw.append('Y');									//DOESNOT OVERIDE JUST CONTINUES THE DATA
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
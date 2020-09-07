//EXAMPLE ON WRITE DATA INTO FILE USING FILEOUTPUT STREAM
import java.io.FileOutputStream;									//PROVIDING ADDRESS OF CLASSES TO JVM
import java.io.IOException;
import java.util.Scanner;
public class FOSDEMO
{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);
		String fna=" ";
		try
		{
			System.out.println("ENTER FILE NAME");
			fna=in.nextLine();
			FileOutputStream f=new FileOutputStream(fna);		//INTIALIZING OBJECT WITH FILE NAME,(fna,true)==>append
			System.out.println("ENTER DATA");
			String s=in.nextLine();
			byte b[]=s.getBytes();								//CONVERTING STRINGS TO BYTE
			f.write(b);											//WRITING DATA
			f=new FileOutputStream(fna,true);					//REINSTANTATION,CONTINUES THE DATA
			f.write(80);										//WRITING CHARACTER USING ASCII CODES
			f.close();											//CLOSES THE FILE
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
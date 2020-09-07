//EXAMPLE ON COPYING DATA FROMONE FILE TO ANOTHER
import java.io.*;												//IMPORTING ALL CLASSES OF IO PACKAGE
import java.util.Scanner;
public class FRFWDEMO
{
	public static void main(String[]arg)throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter sourse file");
		String sf=in.nextLine();
		try(FileReader fr=new FileReader(sf))					//CREATING FILE READER OBJECT WITH SOURCE FILE
		{
			System.out.println("Enter destination file");
			String df=in.nextLine();
			try(FileWriter fw=new FileWriter(df))				//CREATING FILE WRITER OBJECT WITH DESTINATION FILE
			{
				int n=(int)new File(sf).length();				//FINDING THE LENGTH OF SOURCE FILE
				char ch[]=new char[n];							//CREATING AN ARRAYOF SIZE N
				fr.read(ch,0,n);								//READING DATA FROM SOURSE
				fw.write(ch);									//WRITING DATA TO DESTINATION
				System.out.println("DATA COPIED FROM "+sf+" TO "+df);
			}
		}
	}
}
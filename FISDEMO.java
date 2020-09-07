//EXAMPLE ON READ DATA FROM FILE USING FILEINPUT STREAM
import java.io.FileInputStream;									//PROVIDING ADDRESS OF CLASSES TO JVM
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class FISDEMO
{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);
		String fna="";
		try
		{
			System.out.println("ENTER FILE NAME");
			fna=in.nextLine();
			FileInputStream f=new FileInputStream(fna);			//INTIALIZING OBJECT WITH FILE NAME
			int i;
			while((i=f.read())!=-1)								//WHILE LOOP STOPS WHEN NO CHARACTER IS FOUND AT THE CURSOR POSITION
			{													//i.e when -1 is retuened
				System.out.println((char)i);					//DATA IS READ IN BYTE FORMAT WE HAVE TO CONVERT INTO CHARACTER BY TYPECASTING
			}
			f.close();											//CLOSES THE FILE
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null,fna+"\nFILE NOT FOUND");//DISPLAYS A DIALOG BOX WITH GIVEN MESSAGE
		}
	}
}
//EXAMPLE ON READ DATA FROM FILE USING FILEINPUT STREAM
import java.io.*;																//PROVIDING ADDRESS OF CLASSES TO JVM
import java.util.Scanner;
import javax.swing.JOptionPane;
public class BSDEMO
{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);
		String fna="";
		try
		{
			System.out.println("ENTER FILE NAME");
			fna=in.nextLine();
			BufferedReader f=new BufferedReader(new FileReader(fna));			//INTIALIZING OBJECT WITH FILE NAME
			int i;
			while((fna=f.readLine())!=null)										//WHILE LOOP STOPS WHEN NO CHARACTER IS FOUND AT THE CURSOR POSITION
			{																	//i.e when -1 is retuened
				System.out.println(fna);										//DATA IS READ IN BYTE FORMAT WE HAVE TO CONVERT INTO CHARACTER BY TYPECASTING
			}
			f.close();															//CLOSES THE FILE
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null,fna+"\nFILE NOT FOUND");			//DISPLAYS A DIALOG BOX WITH GIVEN MESSAGE
		}
	}
}
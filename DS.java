//EXAMPLE ON READING AND WRITING USING DATA STREAMS
import java.util.Scanner;									//GIVING ADDRESS OF PRE DEFINED CLASSES TO PROGRAM
import java.io.*;
import static java.lang.System.*;
class Employe
{
	static Scanner in=new Scanner(System.in);
	public void writeData()
	{
		try(DataOutputStream f=new DataOutputStream(new FileOutputStream("PAY SLIP.dat")))		//CREATING OBJECTS FOR DATAOUTPUTSTREAM AND FILEOUTPUTSTREAM
		{
			out.println("ENTER EPLOYEE ID,NAME,SALARY");
			int eid=in.nextInt();
			String ena=in.next();
			double sal=in.nextDouble();
			f.writeInt(eid);																	//METHOD FOR WRITING INTEGER DATA
			f.writeUTF(ena);																	//METHOD FOR WRITING STRING DATA
			f.writeDouble(sal);																	//METHOD FOR WRITING DOUBLE DATA
			out.println("DATA STORED SUCCEFULLY");
		}
		catch(IOException e)
		{
			out.println(e);
		}
	}
	public void readData()
	{
		try(DataInputStream f=new DataInputStream(new FileInputStream("PAY SLIP.dat")))		//CREATING OBJECTS FOR DATAINPUTSTREAM AND FILEINPUTSTREAM
		{
			try
			{
				out.printf("%6s%15s%10s\n","EID","NAME","SALERY");
				out.printf("%6s%15s%10s\n","---","----","------");
				while(true)
				{
					int eid=f.readInt();													//METHOD FOR READING INTEGER DATA
					String ena=f.readUTF();													//METHOD FOR READING STRING DATA
					double sal=f.readDouble();												//METHOD FOR READING DOUBLE DATA
					out.printf("%6s%15s%10.2f\n",eid,ena,sal);
				}
			}
			catch(EOFException e)
			{
				out.println("RECORDS OVER");
			}
		}
		catch(IOException e1)
		{
			out.println(e1);
		}
	}
}
public class DS
{
	public static void main(String[]arg)											//MENU DRIVEN METHOD
	{
		Scanner in=new Scanner(System.in);
		out.println("\nMENU");
		out.println("1.DATA ENTRY");
		out.println("2.DATA RETRIVE");
		out.println("3.EXIT");
		out.println("ENTER YOUR OPTION");
		int opt=in.nextInt();
		Employe e=new Employe();
		switch(opt)
		{
			case 1:e.writeData();
			break;
			case 2:e.readData();
			break;
			case 3:System.exit(0);
			break;
			default:out.println("ENTER CORRECT OPTION");
		}
		main(null);
	}
}

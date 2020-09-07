//EXAMPLE ON FORMATED STREAMS
import java.io.*;
public class FS
{
	public static void main(String arg[])throws IOException
	{
		EMPLOYE s1=new EMPLOYE();								//CREATING A OBJECT AND ASSIGNING A REFERENCE
		PrintStream ps=new PrintStream("PP.txt");
		s1.setId(01);											//CALLING METHODS WITH REFERENCE OBJECT
		s1.setName("PRASANTH");
		s1.setExp("4Y");
		s1.setDisg("JR.ENGINEER");
		s1.setSal(54879.00);
		ps.println("ID         :"+s1.getId());
		ps.println("NAME       :"+s1.getName());
		ps.println("EXPERIENCE :"+s1.getExp());
		ps.println("DESIGNATION:"+s1.getDisg());
		ps.println("SALERY     :"+s1.getSal());
	}
}
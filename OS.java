//EXAMPLE ON READING AND WRITING USING OBJECT STREAMS
import java.io.*;									//GIVING ADDRESS OF PRE DEFINED CLASSES TO PROGRAM
class Student implements Serializable
{
	int rno,tot;
	String name;
	public void setData(int rno,String name,int tot)
	{
		this.rno=rno;
		this.tot=tot;
		this.name=name;
	}
	public String toString()
	{
		return(rno+"\t"+name+"\t"+tot);
	}
}
public class OS
{
	public static void main(String[]arg) throws IOException,ClassNotFoundException
	{
		ObjectOutputStream fo=new ObjectOutputStream(new FileOutputStream("TOTAL.dat"));
		Student s1=new Student();
		s1.setData(01,"PP",926);
		fo.writeObject(s1);
		Student s2=new Student();
		s2.setData(11,"DP",906);
		fo.writeObject(s2);
		fo.close();
		System.out.println("DATA SAVED");
		ObjectInputStream fi=new ObjectInputStream(new FileInputStream("TOTAL.dat"));
		Student s=new Student();
		try
		{
			while(true)
			{
				s=(Student)fi.readObject();
				System.out.println(s);
			}
		}
		catch(EOFException e)
		{
			System.out.println(e);
		}
	}
}
//CREATING A EMPLOYE CLASS FOR HW5 WITH ACESS MODIFIERS IN BEAN STYLE
public class EMPLOYE						//USER DEFINED CLASS
{
	private int Id;							//DECLARING VARIABES PRIVATELY
	private String NAME,Exp,Disg;
	private double Sal;
	public void setId(int i)				//METHODS FOR SETTING DATA OF EACH VARIABLE INDIVIDUALLY
	{
		Id=i;
	}
	public void setName(String n)
	{
		NAME=n;
	}
	public void setExp(String e)
	{
		Exp=e;
	}
	public void setDisg(String d)
	{
		Disg=d;
	}
	public void setSal(double s)
	{
		Sal=s;
	}
	public int getId()						//METHODS FOR GETTING DATA OF EACH VARIABLE INDIVIDUALLY
	{
		return Id;
	}
	public String getName()
	{
		return NAME;
	}
	public String getExp()
	{
		return Exp;
	}
	public String getDisg()
	{
		return Disg;
	}
	public double getSal()
	{
		return Sal;
	}
}
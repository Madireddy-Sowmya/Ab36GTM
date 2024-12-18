package AllFromTheBeginning;
//super calling statement will be called implicitly or explicitly
//It is used to call from subclass constructor to super class constructor
class Tan
{
	Tan()
	{
		System.out.println("Tan thita");
	}
}
class Sin extends Tan
{
	Sin(String h)
	{
		//implicit
		System.out.println("Sin thita");
	}
}
class Cos extends Sin
{
	Cos(int a)
	{
		super("Sowmya");
		System.out.println("Cos thita");
	}
}

public class IamTwentySeventhProgramSuperCallingStatement extends Cos {
	IamTwentySeventhProgramSuperCallingStatement()
	{
		super(7);
		System.out.println("inside");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamTwentySeventhProgramSuperCallingStatement f = new IamTwentySeventhProgramSuperCallingStatement();
	

	}

}

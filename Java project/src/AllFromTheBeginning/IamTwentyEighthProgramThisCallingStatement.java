package AllFromTheBeginning;
//It is used to call one constructor to another constructor with in the same class
//It has to written only explicitly

public class IamTwentyEighthProgramThisCallingStatement {
	
	IamTwentyEighthProgramThisCallingStatement()
	{
		this(9);	
		System.out.println("Hi");
	}
	IamTwentyEighthProgramThisCallingStatement(int a)
	{
		this("sowmya");
		System.out.println("number");
	}
	IamTwentyEighthProgramThisCallingStatement(String k)
	{
		
		System.out.println("name");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamTwentyEighthProgramThisCallingStatement g = new IamTwentyEighthProgramThisCallingStatement();

	}

}

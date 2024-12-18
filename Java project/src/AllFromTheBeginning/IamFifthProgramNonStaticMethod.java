package AllFromTheBeginning;

public class IamFifthProgramNonStaticMethod {
	void sub()//If it does not have any modifier then it is called as non static method
	{
		System.out.println("substraction");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		IamFifthProgramNonStaticMethod r = new IamFifthProgramNonStaticMethod();
		r.sub();
		

	}

}

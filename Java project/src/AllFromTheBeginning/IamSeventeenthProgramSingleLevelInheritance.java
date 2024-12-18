package AllFromTheBeginning;
//Inheriting the properties from one class to another class is called Inheritance
//In SLI one sub class will try to inherit the properties from one super class
class Upper
{
	int x=9;
	static void car1()
	{
		System.out.println("Hai i am a car1");
	}
	void bus1()
	{
		System.out.println("Hai i am a bus1");
	}

	
}

public class IamSeventeenthProgramSingleLevelInheritance extends Upper {
	
	static void car()
	{
		System.out.println("Hai i am a car");
	}
	void bus()
	{
		System.out.println("Hai i am a bus");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car();
		car1(); 
		IamSeventeenthProgramSingleLevelInheritance p = new IamSeventeenthProgramSingleLevelInheritance();
		p.bus();
		p.bus1();
		System.out.println(p.x);
		
		

	}

}

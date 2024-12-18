package AllFromTheBeginning;

public class IamSeventhProgramConstructorOverloading {
	//developing multiple constructors but variation in argument list--No of arguments, different arguments , order of occurrence of arguments  
	IamSeventhProgramConstructorOverloading()
	{
		System.out.println("A");
	}
	IamSeventhProgramConstructorOverloading(int a)
	{
		
		System.out.println(a);
	}
	IamSeventhProgramConstructorOverloading(int b , int d)
	{
		int c=50;
		System.out.println(c);
	}
	IamSeventhProgramConstructorOverloading(char h)
	{
		System.out.println(h);
	}

	public static void main(String[] args) { 
		
		// TODO Auto-generated method stub
		IamSeventhProgramConstructorOverloading a = new IamSeventhProgramConstructorOverloading();
		IamSeventhProgramConstructorOverloading b = new IamSeventhProgramConstructorOverloading(90);
		IamSeventhProgramConstructorOverloading c = new IamSeventhProgramConstructorOverloading(80,70);
		IamSeventhProgramConstructorOverloading d = new IamSeventhProgramConstructorOverloading('g');
		

	}

}

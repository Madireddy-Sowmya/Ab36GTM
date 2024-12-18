package AllFromTheBeginning;

public class IamEighthProgramConstructorOverloading {
	// developing multiple methods with the same name but variation in argument list is called method overloading
	//we can overload static as well as non static methods
	
	static void sum()
	{
		System.out.println("Hi");
	}
	static void sum(int a)
	{
		System.out.println(a);   
	}
	void sub()
	{
		System.out.println("hey");
	}
	void sub(double b)
	{
		System.out.println(b);
	}
	IamEighthProgramConstructorOverloading()
	{
		System.out.println("hello");
	}
	IamEighthProgramConstructorOverloading(short c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(8);
		IamEighthProgramConstructorOverloading u=new IamEighthProgramConstructorOverloading();
		IamEighthProgramConstructorOverloading h=new IamEighthProgramConstructorOverloading((short)8);
		u.sub();
		h.sub(78.96);

	}

}

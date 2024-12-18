package Practice;
class Please{
	
	static void sum()
	{
		int a,b,c;
		a=1;
		b=3;
		c=a+b;
		System.out.println(c);
	}
	void car()
	{
		System.out.println("car");
	}
	
}
class IamSecound extends Please
{
	static void bus()
	{
		System.out.println("bus");
	}
	void bike()
	{
		System.out.println("bike");
	}
}

public class HybridLevelInheritance extends IamSecound {
	static void plane()
	{
		System.out.println("plane");
	}
	void truck()
	{
		System.out.println("truck");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		HybridLevelInheritance k=new HybridLevelInheritance();
		k.car();
		bus();
		k.bike();
		plane();
		k.truck();

	}

}

package Practice;
class Level1
{
	 int z=9;
	static void add()
	{
		int a,b,c;
		a=10;
		b=19;
		c=a+b;
		System.out.println(c);
		
	}
	void sub()
	{
		int a,b,c;
		a=10;
		b=19;
		c=b-a;
		System.out.println(c);
		
	}
}

public class SingleInheritance extends Level1  {
	static void mul()
	{
		int a,b,c;
		a=10;
		b=19;
		c=b*a;
		System.out.println(c);
	}
	void div()
	{
		int a,b,c;
		a=10;
		b=19;
		c=b/a;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		mul();
		SingleInheritance e=new SingleInheritance();
		//Level1 g=new Level1();
		e.sub();
		e.div();
		System.out.println(e.z);
	}

}

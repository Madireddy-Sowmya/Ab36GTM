package Practice;

public class MethodOverloading {
	static void add()
	{
		System.out.println("static add without para");
	}
	static void add(double y)
	{
		System.out.println("static add with para");
	}
	void sub()
	{
		System.out.println("non static sub without para");
	}
	void sub(int a)
	{
		System.out.println("non static sub with para");
	}
	MethodOverloading()
	{
		System.out.println("constuctor without para");
	}
	MethodOverloading(String firstname , int b)
	{
		System.out.println("constuctor with para");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(8.9);
		MethodOverloading f=new MethodOverloading();
		MethodOverloading r=new MethodOverloading("sowmya", 24);
		f.sub();
		f.sub(29);   
		
		
		

	}

}

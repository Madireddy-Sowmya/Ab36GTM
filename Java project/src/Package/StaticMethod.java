package Package;

public class StaticMethod {
	
	static void Method()
	{
		System.out.println("you called me from outside of main method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am inside of main method");
      Method();
	}

}

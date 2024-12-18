package Package;

public class NonStaticMethod {
	
	void Method()
	{
		System.out.println("I am non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am Main method");
		NonStaticMethod n = new NonStaticMethod();
		n.Method();
		

	}

}

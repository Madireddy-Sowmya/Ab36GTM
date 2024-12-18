package finalexamjava;

public class JavaTwentyfiveClassFirstProgram {
	JavaTwentyfiveClassFirstProgram()
	{   
		this(89.78);
		System.out.println("JavaTwentyfiveClassFirstProgram");
	}
	JavaTwentyfiveClassFirstProgram(double g)
	{
		System.out.println(g);
	}
	JavaTwentyfiveClassFirstProgram( int a)
	{
		this();
		int b=5;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaTwentyfiveClassFirstProgram(100);

	}

}

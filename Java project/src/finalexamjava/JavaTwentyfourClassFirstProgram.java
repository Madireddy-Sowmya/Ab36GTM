package finalexamjava;
class A
{
	A(String name)
	{
		System.out.println("A");
	}
}
class B extends A
{
	B(int r)
	{   super("sowmya");  
		System.out.println("B");
	}
}

public class JavaTwentyfourClassFirstProgram extends B {
	JavaTwentyfourClassFirstProgram()
	{   super(7);
		System.out.println("JavaTwentyfourClassFirstProgram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentyfourClassFirstProgram p=new JavaTwentyfourClassFirstProgram();

	}

}

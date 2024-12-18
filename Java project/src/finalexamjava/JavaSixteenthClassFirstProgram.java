//Multi Level Inheritance 
package finalexamjava;
class Teacher
{
	static void add()
	{
		System.out.println("add");
	}
	
}
class Mentor extends Teacher
{
	static void sub()
	{
		System.out.println("sub");
	}
}

public class JavaSixteenthClassFirstProgram extends Mentor{
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();

	}

}

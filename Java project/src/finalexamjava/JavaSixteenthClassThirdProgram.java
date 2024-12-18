package finalexamjava;
class Boss
{
	void add()
	{
		System.out.println("a");
	}
	void sub()
	{
		System.out.println("s");
	}
	
}
class Student extends Boss
{
	static void mul()
	{
		System.out.println("m");
	}
	static void div()
	{
		System.out.println("d");
	}
}

public class JavaSixteenthClassThirdProgram extends Student {
	void grater()
	{
		System.out.println("g");
	}
	void equals()
	{
		System.out.println("e");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSixteenthClassThirdProgram i =new JavaSixteenthClassThirdProgram();
		i.add();
		i.sub();
		mul();
		div();
		i.grater();
		i.equals();
		
		

	}

}

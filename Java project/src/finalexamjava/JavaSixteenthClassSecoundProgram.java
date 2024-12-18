//assinment1
package finalexamjava;

class GandFather
{
	void add()
	{
		System.out.println("a");
	}
	void sub()
	{
		System.out.println("s");
	}
	static void mul()
	{
		System.out.println("m");
	}
	static void div()
	{
		System.out.println("d");
	}
	
}

public class JavaSixteenthClassSecoundProgram extends GandFather  {
	static void grater()
	{
		System.out.println("g");
	}
	static void equals()
	{
		System.out.println("e");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSixteenthClassSecoundProgram j= new JavaSixteenthClassSecoundProgram();
		j.add();
		j.sub();
		mul();
		div();
		grater();
		equals();
		

	}

}

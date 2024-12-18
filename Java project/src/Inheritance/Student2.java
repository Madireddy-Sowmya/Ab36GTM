package Inheritance;
class Teacher2
{
	static void add()
	{
		System.out.println("Addition");
	}
}
class Mentor extends Teacher2
{
	static void sub()
	{
		System.out.println("Substraction");
	}
}

public class Student2 extends Mentor {
	
	static void mul()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		mul();
		div();
		add();
		sub();  

	}

}

package finalexamjava;

public class JavaTwelfthClassProgram {
	static
	{
		System.out.println("1");
	}
	{
		System.out.println("3");
	}
	JavaTwelfthClassProgram()
	{
		System.out.println("4");
	}
	static void add()
	{
		System.out.println("5");
	}
	void sub()
	{
		System.out.println("6");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2");
		JavaTwelfthClassProgram i= new JavaTwelfthClassProgram();
		add();
		i.sub();

	}

}

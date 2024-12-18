package finalexamjava;
abstract class Master
{
	abstract void sub();
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("Div");
	}
}

public class JavaNineteenthClassFirstProgram extends Master {
	void add()
	{
		System.out.println("add");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaNineteenthClassFirstProgram y= new JavaNineteenthClassFirstProgram();
		y.add();
		y.sub();
		y.mul();
		y.div();

	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

}

package finalexamjava;
class Print
{
	void java()
	{
		System.out.println("tv java");//over ridden
	}
}

public class JavaEighteenthClassProgram extends Print {
	void java()
	{
		super.java();
		System.out.println("led java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEighteenthClassProgram g = new JavaEighteenthClassProgram();
		g.java();
		

	}

}

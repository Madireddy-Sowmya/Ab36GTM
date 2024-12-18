package finalexamjava;
abstract class Google
{
	abstract void username();
}

public class JavaEighteenthClassFirstProgram extends Google{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEighteenthClassFirstProgram z=new JavaEighteenthClassFirstProgram();
		z.username();

	}

	@Override
	void username() {
		// TODO Auto-generated method stub
		System.out.println("implinentation of username");
		
	}

}

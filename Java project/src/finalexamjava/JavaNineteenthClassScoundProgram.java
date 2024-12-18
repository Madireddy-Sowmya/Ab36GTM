package finalexamjava;
abstract class night
{
	abstract void add();
	abstract void sub();
}
abstract class light extends night
{
	abstract void mul();
	abstract void div();
}

public class JavaNineteenthClassScoundProgram extends light{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaNineteenthClassScoundProgram o =new JavaNineteenthClassScoundProgram();
		o.add();
		o.sub();
		o.mul();
		o.div();

	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

	@Override
	void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

}

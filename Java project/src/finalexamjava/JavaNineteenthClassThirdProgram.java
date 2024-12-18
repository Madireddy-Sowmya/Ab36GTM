package finalexamjava;
abstract class Five
{
	abstract void add();
	abstract void sub();
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
}
abstract class Four extends Five
{
	static void grater()
	{
		System.out.println("grater");
	}
	void smaller()
	{
		System.out.println("smaller");
	}
}

public class JavaNineteenthClassThirdProgram extends Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaNineteenthClassThirdProgram t=new JavaNineteenthClassThirdProgram();
		t.add();
		t.sub();
		t.mul();
		t.div();
		grater();
		t.smaller();



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

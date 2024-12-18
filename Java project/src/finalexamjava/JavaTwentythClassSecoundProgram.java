package finalexamjava;
interface hen
{
	void add();
	void sub();
}
abstract class Egg implements hen
{
	abstract void mul();
	abstract void div();
	void car()
	{
		System.out.println("car");
	}
}

public class JavaTwentythClassSecoundProgram extends Egg{
	void bus()
	{
		System.out.println("bus");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentythClassSecoundProgram d = new JavaTwentythClassSecoundProgram();
		d.add();
		d.sub();
		d.mul();
		d.div();
		d.car();
		d.bus();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
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

}

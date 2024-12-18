package finalexamjava;
interface pen
{
	void add();
	void sub();
}
interface pencil extends pen
{
	void mul();
	void div();
}
public class JavaTwentythClassFirstProgram implements pencil{
	void sad()
	{
		System.out.println("sad");
	}
	void happy()
	{
		System.out.println("happy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentythClassFirstProgram f = new JavaTwentythClassFirstProgram();
		f.add();
		f.sub();
		f.mul();
		f.div();
		f.sad();
		f.happy();

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
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}

}

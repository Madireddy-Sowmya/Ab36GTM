package finalexamjava;
interface Sun
{
	void add();
	void sub();
}
abstract class moon
{
	abstract void mul();
	abstract void div();
	void bed()
	{
		System.out.println("bed");
	}
	void dead()
	{
		System.out.println("dead");
	}
	
}


public class JavaTwentyfirstClassFirstProgram extends moon implements Sun{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentyfirstClassFirstProgram l =new JavaTwentyfirstClassFirstProgram();
		l.add();
		l.sub();
		l.mul();
		l.div();
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

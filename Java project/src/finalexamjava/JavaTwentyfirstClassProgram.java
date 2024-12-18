package finalexamjava;
interface Match
{
	void add();
	void sub();
}
interface Bench
{
	void mul();
	void div();
}

public class JavaTwentyfirstClassProgram implements Match,Bench {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentyfirstClassProgram p =new JavaTwentyfirstClassProgram();
		p.add();
		p.sub();
		p.mul();
		p.div();

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

}

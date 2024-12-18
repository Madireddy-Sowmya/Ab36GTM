package finalexamjava;
interface Paint
{
	void add();
	void sub();
}
public class JavaTwentythClassProgram implements Paint{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentythClassProgram l = new JavaTwentythClassProgram();
		l.add();
		l.sub();

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

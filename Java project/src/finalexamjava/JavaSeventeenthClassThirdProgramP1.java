package finalexamjava;
class Part1
{
	static void add()
	{
		System.out.println("add");
	}
}
class Part2 extends Part1
{
	void sub()
	{
		System.out.println("sub");
	}
}

public class JavaSeventeenthClassThirdProgramP1 extends Part2 {
	void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		JavaSeventeenthClassThirdProgramP1 u=new JavaSeventeenthClassThirdProgramP1();
		u.sub();
		u.mul();

	}

}

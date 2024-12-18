package finalexamjava;
class State
{
	State()
	{
		System.out.println("state");
	}
	State(int i)
	{
		System.out.println("numer is passed");
	}
}

public class JavaTwentyfourClassProgram extends State {
	JavaTwentyfourClassProgram()
	{
		//super();
		super(7);
		System.out.println("JavaTwentyfourClassProgram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTwentyfourClassProgram m=new JavaTwentyfourClassProgram();

	}

}

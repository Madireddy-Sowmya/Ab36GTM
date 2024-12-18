package Practice;
abstract class Hello
{
	abstract void ji();
	abstract void Hi();
}
abstract class Minu
{
	abstract void li();
	abstract void tea();
}
public class AbstractMethod extends Hello {
	void ji()
	{
		System.out.println("ji");
	}
	void Hi()
	{
		System.out.println("Hi");
	}
	void li()
	{
		System.out.println("Li");
	}
	void tea()
	{
		System.out.println("tea");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMethod x=new AbstractMethod();
		x.ji();
		x.Hi();
		x.li();
		x.tea();

	}

}

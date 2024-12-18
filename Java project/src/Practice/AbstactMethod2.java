package Practice;
abstract class Pen
{
	abstract void scale();
	abstract void pin();
	
	void pencil()
	{
		System.out.println("pencil");
	}
	void sharpner()
	{
		System.out.println("sharpner");
	}
}
abstract class Normal extends Pen
{
	void pet()
	{
		System.out.println("pet");
	}
	void share()
	{
		System.out.println("share");
	}

}
public class AbstactMethod2 extends Normal {
	void scale()
	{
		System.out.println("scale");
	}
	void pin()
	{
		System.out.println("pin");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstactMethod2 o=new AbstactMethod2();
		o.pencil();
		o.sharpner();
		o.pet();
		o.share();
		o.scale();
		o.pin();

	}

}

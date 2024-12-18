package AllFromTheBeginning;
//Abstract class is that class which have abstract methods in it
//Any method with no implementation is called as abstract method
abstract class Men
{
	abstract void line();
	abstract void stright();
	void scale()
	{
		System.out.println("Scaling");
	}
	static void train()
	{
		System.out.println("training");
	}
}
abstract class Might extends Men
{
	void staile()
	{
		System.out.println("Stailling");
	}
	static void ten()
	{
		System.out.println("number ten");
	}
}
public class IamTwentySecoundProgramAbstractClass extends Might {
	void line()
	{
		System.out.println("linning");
	}
	void stright()
	{
		System.out.println("cross");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		train();
		ten();
		IamTwentySecoundProgramAbstractClass j = new IamTwentySecoundProgramAbstractClass();
		j.scale();
		j.staile();
		j.line();
		j.stright();
		
		

	}

}
